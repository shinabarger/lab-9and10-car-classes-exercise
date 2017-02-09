/**
 * Created by davidshinabarger on 2/9/17.
 */
public class Car {
    double price;
    int orderNumber;
    int miles;
    private String make;
    private String model;
    private int year;

    public Car(int orderNumber, String make, String model, int year, double price, int miles) {
        this.orderNumber = orderNumber;
        this.make = make;
        this.model = model;
        this.year = year;
        this.miles = miles;
        this.price = price;
    }
    public int getOrderNumber() {
        return orderNumber;
    }
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getMiles() {
        return price;
    }
    public void setMiles(double miles) {
        this.price = miles;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return orderNumber + "\t" + make + "\t" + model + "\t" + year + "\t$" + price;
    }
}


