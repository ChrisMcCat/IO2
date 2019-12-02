package com.infoshare.jjdd8;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String filePath;
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Podaj sciezke od pliku: ");
            filePath = scanner.next();
        }

        try (Scanner scanner = new Scanner(new FileInputStream(new File(filePath)))){
            int sum = 0;
            while (scanner.hasNext()){
                try {
                    sum += Integer.valueOf(scanner.next());
                }
                catch (NumberFormatException e) {
                    System.out.println("wrong input");
                }
            }
            System.out.println("Suma to: " + sum);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
