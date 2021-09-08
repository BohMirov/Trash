package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Food buterbrod = new Food("Buter", Statment.Cold);

        Microwave microwave = new Microwave(new Plate(), buterbrod);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру и время:");
        int temp = scanner.nextInt(), time = scanner.nextInt();

        microwave.Start(temp, time);

        buterbrod = microwave.getFood();

        if (buterbrod.statment == Statment.Hot || buterbrod.statment == Statment.Hot) {
            System.out.println("Бутерброд готов");
        }
        else if (buterbrod.statment == Statment.Cold || buterbrod.statment == Statment.Freeze) {
            System.out.println("Бутерброд холодный");
        }
        else if (buterbrod.statment == Statment.Normal) {
            System.out.println("Бутерброд готов не до конца");
        }
        else if (buterbrod.statment == Statment.Dead) {
            System.out.println("Бутерброд умер");
        }
        else {
            System.out.println("Бутерброд исчез");
        }
    }
}
