package oop;

public class Kitty extends Cats {
    // int color =100; access only from this package (oop)
    //public int color =100; //access only from any packages
    // protected int color =100;
    private int color; //access only for this Class
    {
        color = - 1;//initialisation of the variable
    }
    String name;
    double temperature;
    public Kitty() {}//line of code '= new Kitty()' calls the constructor
    public Kitty(int color) {//overloading
        this.color = color;
    }
    public Kitty(int color, String name,double temperature) {
        this.color = color;
        this.name = name;
        this.temperature = temperature;

    }

    private boolean checkColor(int color) {
        return (0 < color && color <= 100);
    }

    private boolean isAnyValueCorrect(int value, int min, int max) {
        return (min < value && value <= max);
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        //int min =0;
        //int max = 100;
        //if(checkColor(color)){//private method is called only from the class where it was created
        if (isAnyValueCorrect(color, 0, 100)) {
            this.color = color;
        } else {
            System.out.println("Error");
        }


        double weight = 5;


    }
}
