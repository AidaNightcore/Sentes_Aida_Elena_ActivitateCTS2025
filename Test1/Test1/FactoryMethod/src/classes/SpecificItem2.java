package classes;

public class SpecificItem2 extends ItemClass {
    private float itemFloat;

    public SpecificItem2(String itemString, int itemInt, float itemFloat) {
        super(itemString, itemInt);
        this.itemFloat = itemFloat;
    }

    @Override
    public void getItemDesription() {

    }
}
