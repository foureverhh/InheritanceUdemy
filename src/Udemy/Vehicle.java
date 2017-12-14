package Udemy;

public class Vehicle
{
    private int wheels;
    private int seats;
    private int speed;


    public Vehicle()
    {

    }

    public Vehicle(int wheels, int seats, int speed) {
        this.wheels = wheels;
        this.seats = seats;
        this.speed = speed;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public int getSpeed() {
        return speed;
    }
}
