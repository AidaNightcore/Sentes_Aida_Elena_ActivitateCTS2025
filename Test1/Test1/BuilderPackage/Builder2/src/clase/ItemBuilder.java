package clase;

public class ItemBuilder implements IItemBuilder{
    private int itemInt;
    private String itemString;
    private double itemDouble;

    public ItemBuilder(int itemInt, String itemString) {
        this.itemInt = itemInt;
        this.itemString = itemString;
        this.itemDouble = 0;
    }

    @Override
    public ItemClass itemBuilder() {
        ItemClass item = new ItemClass(itemInt, itemString, itemDouble);
        return item;
    }

    @Override
    public IItemBuilder setItemDouble(double itemDouble) {
        this.itemDouble = itemDouble;
        return this;
    }

    @Override
    public ItemClass getItem() {
        return null;
    }
}
