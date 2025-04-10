package classes;

public class ItemBuilder implements IItemBuilder {
    ItemClass item;

    public ItemBuilder(int itemInt, String itemString){
        item = new ItemClass(itemInt, itemString,0);
    }

    @Override
    public ItemClass buildItem() {
        return item;
    }

    @Override
    public IItemBuilder setItemFloat(float itemFloat) {
        this.item.setItemFloat(itemFloat);
        return this;
    }

//    @Override
//    public IItemBuilder setItemString(String itemString) {
//        this.item.setItemString(itemString);
//        return this;
//    }
//
//    @Override
//    public IItemBuilder setItemInt(int itemInt) {
//        this.item.setItemInt(itemInt);
//        return this;
//    }

    @Override
    public ItemClass getItem() {
        return this.item;
    }
}
