package ExeceptionMain;
import ArthimaticOperations.Energy;
import EnergyArthimaticException.EnergyArthimaticException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int complete=0;
        while(complete==0){

            try{
                System.out.println("Enter a mass in Kg: ");
                float mass = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter a time in seconds: ");
                float time = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter a distance in meter: ");
                float distance = Integer.parseInt(scanner.nextLine());

                Energy energy = new Energy(mass,time,distance);
                System.out.println(energy.calculateEnergy());
            }
            catch (EnergyArthimaticException energyArthimaticException){
                System.out.println(energyArthimaticException.getMessage());
            }
            catch (Exception e){

                System.out.println(e.getMessage());
            }
            finally {
                do  {
                    System.out.println("Do you want enter again enter 0 to complete and 1 to not complete");
                    complete = Integer.parseInt(scanner.nextLine());
                    if (complete != 1 && complete != 0) {
                        System.out.println("Please enter 1 or 0");
                    }
                }while(complete != 1 && complete != 0);
                if(complete == 1){
                    scanner.close();
                    System.out.println("I hope you enjoyed with my beautiful scientific program ️❤️");
                }
            }


        }
            }
}
