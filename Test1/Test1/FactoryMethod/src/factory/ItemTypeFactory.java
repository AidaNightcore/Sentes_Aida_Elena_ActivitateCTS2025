package factory;

import classes.ItemClass;

public interface ItemTypeFactory {
    public ItemClass buildItem(SpecificItemType specificItemType, String itemString, int itemInt);
}
