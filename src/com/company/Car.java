package com.company;

public class Car implements Vehicle{

    int ids = 0;

    @Override
    public int id(int ids) {
        return ids;
    }

    public void setIds(int ids) {
        this.ids = ids;
    }

    @Override
    public void printName() {

        System.out.println("Interface "+ids);

    }
}
