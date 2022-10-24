import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Oblicz BMI");
            System.out.println("2. Tablica BMI");
            System.out.println("3. Przypomnij DB");
            System.out.println("4. Exit");
            switch (scanner.nextInt()) {

                case 1:
                    calculateBMI();

                    break;
                case 2:
                   listCalculations();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }

        private static void calculateBMI() {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            System.out.println("Podaj wzrost w centymetrach:");
            double wzrost = scanner.nextDouble();
            System.out.println("Podaj wagę:");
            double waga = scanner.nextDouble();
            double result = (waga / (wzrost * wzrost))*10000;
            System.out.println(result);
            if (result < 18) {
                System.out.println("Niedowaga");
            }
            if (result > 35) {
                System.out.println("Nadwaga");
            }else {
                System.out.println("Waga w normie");
            }
            int ID = random.nextInt(100000);
            System.out.println("ID Twojego wyliczenia to: " + ID);
        }

        public static void listCalculations(User[] user){
            for (User element : user){
                System.out.println(element);
            }
        }

}
