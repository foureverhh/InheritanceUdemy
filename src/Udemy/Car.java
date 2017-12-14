package Udemy;

public class Car extends Vehicle
{
    private String driver;
    private int fuel;

    public Car() {

    }

    public Car(int wheels, int seats, int speed, String driver, int fuel) {
        super(wheels, seats, speed);
        this.driver = driver;
        this.fuel = fuel;
    }

    public void speed(int speed,int fuel)
    {
        System.out.println(driver+" drives and speed is "+speed+" with "+fuel+" fuel.");
    }

    public void steering(int direction)
    {
        System.out.println(driver+" drives "+direction+" directions");
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public String getDriver() {
        return driver;
    }

    public int getFuel() {
        return fuel;
    }
}
