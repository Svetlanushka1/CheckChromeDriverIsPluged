package oop;

public interface Animals {
    public int numberOfLegs();//Not use 'private methods' in Interface!!!
    public boolean isFlying();
    public default String voice(){//Abstract method in Interface
        return " ";

    }


}
