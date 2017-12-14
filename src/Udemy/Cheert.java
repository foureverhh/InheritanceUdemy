package Udemy;

public class Cheert extends Car
{
    private String color;

    public Cheert ()
    {

    }

    public Cheert (String color)
    {
        this.color =color;
    }

    public Cheert(int wheels, int seats, int speed, String driver, int fuel, String color) {
        super(wheels, seats, speed, driver, fuel);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    @Override
    public void steering(int direction)
    {
        super.steering(direction);
        System.out.println("The color is "+ color);
    }
}
