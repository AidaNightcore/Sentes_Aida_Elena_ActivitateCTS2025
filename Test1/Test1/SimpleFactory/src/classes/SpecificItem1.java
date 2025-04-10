package classes;

public class SpecificItem1 extends ItemClass {
    private String itemSpecificString;

    public SpecificItem1(String itemClassString, int itemClassInt, String itemSpecificString) {
        super(itemClassString, itemClassInt);
        this.itemSpecificString = itemSpecificString;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SpecificItem1{");
        sb.append("itemSpecificString='").append(itemSpecificString).append('\'');
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
