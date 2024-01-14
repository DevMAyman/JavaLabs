package StreamAPI;

import dao.CountryDao;
import dao.InMemoryWorldDao;
import domain.City;
import domain.Country;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        InMemoryWorldDao inMemoryWorldDao = InMemoryWorldDao.getInstance();
        Map<String,Optional<City>> mylist= inMemoryWorldDao.getCities().values().stream().
                collect(
                        Collectors.groupingBy(City::getCountryCode, Collectors.maxBy(Comparator.comparingInt(City::getPopulation)))
                );
        mylist.forEach((countryCode, optionalCity) -> {
            if (optionalCity.isPresent()) {
                City city = optionalCity.get();
                System.out.println("Country Code: " + countryCode + ", City Name: " + city.getName());
            }
        });
        /********************************************************************************/
       Map<String, Optional<City>> mostPopulatedCitiesByContinent = inMemoryWorldDao.getCities().
                values().stream()
                .collect(
                        Collectors.groupingBy(city -> inMemoryWorldDao.findCountryByCode(city.getCountryCode()).getContinent(),Collectors.maxBy(Comparator.comparing(City::getPopulation)))
                );
        mostPopulatedCitiesByContinent.forEach(
                (continent,optionalCity)->{
                    System.out.println(continent+" : "+optionalCity);
                }
        );

        /********************************************************************************/
        Optional<City> mostPopulatedCapital= inMemoryWorldDao.getCities().values().stream()
                .filter(city -> city.getId() == inMemoryWorldDao.findCountryByCode(city.getCountryCode()).getCapital())
                .collect(
                      Collectors.maxBy(Comparator.comparingInt(City::getPopulation))
                );

        System.out.println(mostPopulatedCapital);
}
}
