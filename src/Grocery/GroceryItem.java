package Grocery;

import util.Input;

public class GroceryItem {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumItem() {
        return numItem;
    }

    public void setNumItem(Integer numItem) {
        this.numItem = numItem;
    }

    protected Integer numItem;

public GroceryItem(String name, Integer numItem){
    this.name = name;
    this.numItem = numItem;
}



}
