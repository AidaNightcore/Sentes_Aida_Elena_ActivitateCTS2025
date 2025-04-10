package classes;

public class ItemClass {
    private int itemInt;
    private String itemString;
    private float itemFloat;

    public int getItemInt() {
        return itemInt;
    }

    public void setItemInt(int itemInt) {
        this.itemInt = itemInt;
    }

    public String getItemString() {
        return itemString;
    }

    public void setItemString(String itemString) {
        this.itemString = itemString;
    }

    public float getItemFloat() {
        return itemFloat;
    }

    public void setItemFloat(float itemFloat) {
        this.itemFloat = itemFloat;
    }

    public ItemClass(int itemInt, String itemString, float itemFloat) {
        this.itemInt = itemInt;
        this.itemString = itemString;
        this.itemFloat = itemFloat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ItemClass{");
        sb.append("itemInt=").append(itemInt);
        sb.append(", itemString='").append(itemString).append('\'');
        sb.append(", itemFloat=").append(itemFloat);
        sb.append('}');
        return sb.toString();
    }
}
