package classes;

public abstract class ItemClass {
    protected String itemString;
    protected int itemInt;

    public ItemClass(String itemString, int itemInt) {
        this.itemString = itemString;
        this.itemInt = itemInt;
    }

    public String getItemString() {
        return itemString;
    }

    public int getItemInt() {
        return itemInt;
    }

    public abstract void getItemDesription();
}
