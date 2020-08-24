package com.company;

import java.util.ArrayList;
import java.util.List;

public class Gift {
    private List<IItem> items = new ArrayList<>();

    String name;
    float price;
    public void addItem(IItem item){
        items.add(item);
    }


}
