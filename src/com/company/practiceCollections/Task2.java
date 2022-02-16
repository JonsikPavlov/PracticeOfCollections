package com.company.practiceCollections;

import java.util.*;

public class Task2 {
    // Даны числа от 1 до 100 (цикл). Необходимо создать список и добавить в него все числа, которые не кратны 3 и 5
    public static void main(String[] args) {

        List<Integer> numbersDividedOn3And5 = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            if (i % 3 != 0 && i % 5 != 0){
                numbersDividedOn3And5.add(i);
            }
        }
        System.out.println(numbersDividedOn3And5);
    }
}
