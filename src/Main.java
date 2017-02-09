import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        while (true) {
            Scanner scan = new Scanner(System.in);
            int removeNumber = 0;
            String userAnswer2 = "";

            ArrayList<Car> carList = new ArrayList<>();

            carList.add(new Car(1, "Mercedez", "Smart", 2015, 1324.52, 0));
            carList.add(new Car(2, "Mercedez", "Smart", 2016, 1200.52, 0));
            carList.add(new Car(3, "Mercedez", "Smart", 2017, 1324.52, 0));

            carList.add(new UsedCar(4, "Ford", "taurus", 2005, 1500.00, 500));
            carList.add(new UsedCar(5, "Ford", "taurus", 2006, 1400.00, 10502));
            carList.add(new UsedCar(6, "Ford", "taurus", 2007, 1300.00, 131354));

            System.out.println("Car #" + "\t" + "MAKE" + "\t" + "MODEL" + "\t" + "YEAR" + "\t" + "PRICE" + "\t\tMILES");
            System.out.println("_________________________________________________");
            for (Car cars : carList) {
                System.out.println(cars.toString());
            }

            System.out.println();
            int userAnswer = Validator.getInt(scan, "Pick a car: ", 1, 6);

            for (int i = 0; i < userAnswer; i++) {

            }
            System.out.println("You selected number: " + userAnswer);
            if (confirmCarPurchase(scan, removeNumber, carList, userAnswer)) break;

        }

    }
    private static boolean confirmCarPurchase(Scanner scan, int removeNumber, ArrayList<Car> carList, int userAnswer) {
        String userAnswer2;
        System.out.println("Would you like this car? Y/N");
        userAnswer2 = scan.nextLine();

        if (userAnswer2.equals("Y")) {
            for (int i = 0; i < userAnswer; i++) {
                removeNumber = i;

            }
            carList.remove(removeNumber);
            System.out.println("Car #" + "\t" + "MAKE" + "\t" + "MODEL" + "\t" + "YEAR" + "\t$" + "PRICE");
            System.out.println("______________________________");
            for (Car cars : carList) {
                System.out.println(cars.toString());

            }
            System.out.println("Thanks. Enjoy your car.");
            return true;

        } else {
            System.out.println("Okay, here are the cars again.");

        }
        return false;
    }

}