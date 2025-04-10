package factory;

import classes.ItemClass;

public interface ItemFactory {
    ItemClass buildItem(ItemType itemType, String itemClassString, int itemClassInt);
}
