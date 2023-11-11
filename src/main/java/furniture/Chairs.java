package furniture;

public class Chairs extends BaseOffice implements office_furniture {
    int legs_number = 4;
    String roll;
    String drag;
    public boolean isRolls() {
        return true;
    }

    @Override
    public void move(String roll, String drag) {
        super.move(roll, drag);
    }
}
