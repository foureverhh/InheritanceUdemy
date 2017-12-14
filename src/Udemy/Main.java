package Udemy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cheert cheert = new Cheert();

        cheert.setColor("white");

        cheert.setDriver("Jack");

        cheert.setFuel(6);

        cheert.setSpeed(10);

        cheert.speed(cheert.getSpeed(),cheert.getFuel());

        cheert.steering(4);

        System.out.println();

        cheert= new Cheert(3,4,1,"Henry",10,"Black");

        cheert.setSpeed(2);

        cheert.speed(cheert.getSpeed(),cheert.getFuel());

        cheert.steering(4);
    }
}
