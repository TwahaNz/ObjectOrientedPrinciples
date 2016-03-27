package com.tnz.app.plk.disobey.domain;

import java.util.List;

/**
 * Created by Admin on 3/27/16.
 */
public class Order {

    private List<String> selectedItems;

    public Order(List<String> selectedItems) {
        this.selectedItems = selectedItems;
    }

    public int totalItems(){
        return selectedItems.size();
    }
}
