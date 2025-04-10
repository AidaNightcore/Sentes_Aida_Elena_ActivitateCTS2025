package classes;

public interface IItemBuilder {
    public ItemClass buildItem();

//    public IItemBuilder setItemString(String itemString);
//    public IItemBuilder setItemInt(int itemInt);
    public IItemBuilder setItemFloat(float itemFloat);

    public ItemClass getItem();
}
