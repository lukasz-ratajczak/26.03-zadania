package com.company;

import java.lang.reflect.Array;

public class Tablice {

    public int[] tab(int input){



        int[] tab = new int[10];


        for(int i = 0; i < tab.length ; i++){

            tab[i] = input + i;
            System.out.println(tab[i]);
        }
        return tab;
    }

}
