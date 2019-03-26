package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

//        Car car1 = new Car();
//        Vehicle veh1 = new Vehicle();
//
//        car1.setId(122);
//        veh1.setId(144);
//
//        car1.printId();
//        veh1.printId();

//    TaskException scan = new TaskException();
//        System.out.println("Wybrales liczbe "+scan.scan());as
//
//Car car = new Car();
//car.id(5);
//car.printName();

////CW3 Projekt
//        System.out.println("Podaj tekst do zapisania:");
//
//        Scanner scanner = new Scanner(System.in);
//        String textToSave = scanner.nextLine();
//
//        List<String> lines = Arrays.asList(textToSave);
//
//        Path file = Paths.get("text.txt");
//        Files.write(file, lines, Charset.forName("UTF-8"));
//
//        System.out.println(Files.readAllLines(file));


////CW2
//        int[] arr = {3412, 242, 45, 21, 1125, 75, 43};
//
//        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.bubbleSort(arr);
//        System.out.println("Sorted");
//        bubbleSort.printArray(arr);

//CW1

    User admin = new Admin();
    User developer = new Developer();

    admin.showInfo();
    developer.showInfo();




    }
}