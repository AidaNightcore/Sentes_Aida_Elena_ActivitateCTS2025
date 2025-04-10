package classes;

import java.util.ArrayList;
import java.util.List;

public class ItemClass extends AbstractItemClass {

    private String itemString;
    private List<String> itemListString;

    public ItemClass() {
        itemListString = new ArrayList<String>();
    }

    public void setItemString(String itemString) {
        this.itemString = itemString;
    }

    public void setItemListString(List<String> itemListString) {
        this.itemListString = itemListString;
    }

    @Override
    public ItemClass clone() {
        ItemClass itemList = new ItemClass();
        List<String> itemTempList= new ArrayList<String>();

        for (String itemIndex : this.itemListString){
            itemTempList.add(itemIndex);
        }
        itemList.setItemListString(itemTempList);
        return itemList;
    }
}
