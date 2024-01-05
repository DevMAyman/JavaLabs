package Complex;
import ComplexNumber.ComplexNumber;

public class Complex {

    public static void main(String[] args) {
        ComplexNumber<Integer> ComplexNumber1 = new ComplexNumber<Integer>(5,-6);
        ComplexNumber<Integer> ComplexNumber2 = new ComplexNumber<Integer>(6,7);
        ComplexNumber<Integer> AddedComplexNumber = ComplexNumber1.addComplex(ComplexNumber2);
        ComplexNumber<Integer> SubstractComplexNumber = ComplexNumber1.substractComplex(ComplexNumber2);
        ComplexNumber<Integer> MultipliedComplexNumber = ComplexNumber1.multipleComplex(ComplexNumber2);
        System.out.println("AddedComplexNumber: "+AddedComplexNumber.displayComplex());
        System.out.println("SubstractComplexNumber: "+SubstractComplexNumber.displayComplex());
        System.out.println("MultipliedComplexNumber: "+MultipliedComplexNumber.displayComplex());
    }
}
