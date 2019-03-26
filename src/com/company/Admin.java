package com.company;

public class Admin implements User{
    String rola = "Admin";
    @Override
    public void showInfo() {
        System.out.println(name+ " - " +rola);
    }

}
