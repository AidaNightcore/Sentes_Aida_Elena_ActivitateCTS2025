package classes;

public class SpecificItem1 extends ItemClass{
    private double itemDouble;

    public SpecificItem1(String itemString, int itemInt, double itemDouble) {
        super(itemString, itemInt);
        this.itemDouble = itemDouble;
    }

    @Override
    public void getItemDesription() {

    }
}
