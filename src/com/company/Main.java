package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int liczba = random.nextInt(100);
        System.out.println(liczba);
    }
}
