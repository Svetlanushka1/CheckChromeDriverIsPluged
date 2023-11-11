package oop;

public class Main {
    public static void main(String[] args) {
        System.out.println("hi");
        Cats tommy;
        tommy = new Cats();
        Cats tom = new Cats();
        tommy.numberOfLegs();
        tommy.bodyTemperature = 37.2;
        System.out.println("Tommy's: " + tommy.bodyTemperature);
        System.out.println("Legs of Tom is: " + tom.numberOfLegs());

        Kitty murka = new Kitty(50);
        System.out.println("Murka's color is: " + murka.getColor()
                + "\n Muurka's legs " + murka.numberOfLegs()
        +    "\n Murka's body temperature is: " + murka.bodyTemperature);

        murka.setColor(200);
        Kitty murka2 = new Kitty(7, "Murka", 37.0);

        Point p = new Point(1,1,11);
        Point p1 = new Point(2,2,12);
        Point p2 = new Point(3,3,13);
        System.out.printf("%s", p.getX());
        System.out.println("\n");
        ////////////////////////////////////////////////
        Dogs marty = new Dogs();
        System.out.println("marty's Weight() = " + marty.getWeight());
        marty.setWeight(100.00);
        System.out.println("marty;s double constructor");




    }
}
class Point{
    private int x,y;
    private int color;
public Point(int x, int y, int color) {//constructor(int x, int y, int color)
    this.x = x;
    this.y = y;
    this.color = color;
}
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}