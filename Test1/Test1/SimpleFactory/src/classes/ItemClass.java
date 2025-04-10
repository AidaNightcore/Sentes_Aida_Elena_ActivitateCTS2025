package classes;

public abstract class ItemClass {
    protected String itemClassString;
    protected int itemClassInt;

    public ItemClass(String itemClassString, int itemClassInt) {
        this.itemClassString = itemClassString;
        this.itemClassInt = itemClassInt;
    }

    public String getItemClassString() {
        return itemClassString;
    }

    public int getItemClassInt() {
        return itemClassInt;
    }

    public abstract void describeItem();
}
