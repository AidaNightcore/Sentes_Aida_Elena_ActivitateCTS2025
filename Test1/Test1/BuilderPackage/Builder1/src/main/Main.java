package main;

import classes.IItemBuilder;
import classes.ItemBuilder;

public class Main {
    public static void main(String[] args) {
        IItemBuilder builder1 = new ItemBuilder(1, "Item1");
        builder1.setItemFloat(1.2F);

        IItemBuilder builder2 = new ItemBuilder(2, "Item2");
        builder2.setItemFloat(2.3F);
    }
}