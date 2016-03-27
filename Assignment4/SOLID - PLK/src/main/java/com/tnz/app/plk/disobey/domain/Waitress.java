package com.tnz.app.plk.disobey.domain;

/**
 * Created by Admin on 3/27/16.
 */
public class Waitress {

    private String name;
    private Order order;
    private int total;

    public Waitress(String name, Order order) {
        this.name = name;
        this.order = order;
        total = order.totalItems(); //Violets the PLK
    }

    public int getTotal() {
        return total;
    }
}
