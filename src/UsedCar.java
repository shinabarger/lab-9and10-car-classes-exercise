public class UsedCar extends Car {

    public UsedCar(int orderNumber, String make, String model, int year, double price, int miles) {
        super(orderNumber, make, model, year, price, miles);
    }

    @Override
    public String toString() {

        //Don't add return statements that you already have in the car.java
        return super.toString() + "\t" + "\t\t" + miles;
    }

}