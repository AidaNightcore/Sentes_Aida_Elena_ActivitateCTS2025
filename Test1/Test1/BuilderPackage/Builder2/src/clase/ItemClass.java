package clase;

public class ItemClass {
    private int itemInt;
    private String itemString;
    private double itemDouble;

    public ItemClass(int itemInt, String itemString, double itemDouble) {
        this.itemInt = itemInt;
        this.itemString = itemString;
        this.itemDouble = itemDouble;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ItemClass{");
        sb.append("itemInt=").append(itemInt);
        sb.append(", itemString='").append(itemString).append('\'');
        sb.append(", itemDouble=").append(itemDouble);
        sb.append('}');
        return sb.toString();
    }
}
