package com.company;

import java.util.Scanner;

public class Strings {


    public int counter(){

        int dots = 0;
        Scanner scan = new Scanner(System.in);
        String pct = scan.nextLine();


        System.out.println(pct);

        for (int i = 0; i < pct.length(); i++){

            if(pct.charAt(i) == '.') {
                dots++;
            }
        }

        return dots;
    }
}
