package factory;

import classes.ItemClass;

public class SpecificItem2Factory implements ItemTypeFactory{
    @Override
    public ItemClass buildItem(SpecificItemType specificItemType, String itemString, int itemInt) {
        return null;
    }
}
