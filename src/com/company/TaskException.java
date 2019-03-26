package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskException {

    int scan = 0;

    public int scan()   {

        System.out.println("Wybierz liczbe calkowita:");

while(true) {

    try {
        Scanner scanner = new Scanner(System.in);
        scan = scanner.nextInt();
        break;
    } catch (Exception e) {

        System.out.println("Wybrales zle! Wybierz jeszcze raz: ");

//        scan = scanner.nextInt();
    }


}
    return scan;
    }
}


