package com.company;

public class Item {

    private int weight;

    Item(String type, int weight) {
        String type1 = type;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
