package main;

import clase.IItemBuilder;
import clase.ItemBuilder;
import clase.ItemClass;

public class Main {
    public static void main(String[] args) {

        IItemBuilder builder = new ItemBuilder(1, "Item2");
        builder.setItemDouble(1.1);

        ItemClass item = builder.itemBuilder();
        System.out.println(item);

    }
}