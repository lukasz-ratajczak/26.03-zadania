package com.company;

public class Developer implements User{
    String rola = "Developer";
    @Override
    public void showInfo() {
        System.out.println(name+ " - " +rola);;
    }
}
