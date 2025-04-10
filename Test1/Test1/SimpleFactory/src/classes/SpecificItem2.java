package classes;

public class SpecificItem2 extends ItemClass {
    private double itemSpecificDouble;

    public SpecificItem2(String itemClassString, int itemClassInt, double itemSpecificDouble) {
        super(itemClassString, itemClassInt);
        this.itemSpecificDouble = itemSpecificDouble;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SpecificItem2{");
        sb.append("itemSpecificDouble=").append(itemSpecificDouble);
        sb.append(", itemClassString='").append(itemClassString).append('\'');
        sb.append(", itemClassInt=").append(itemClassInt);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void describeItem() {
        System.out.println(this.toString());
    }
}
