package com.company.practiceCollections;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        //1 task Написать программу, которая выведет все элементы листа
        List<String> array = new ArrayList<>();
        array.add("mounting");
        array.add("full");
        array.add("of");
        array.add("corps");
        array.add("of our");
        array.add("enemies");
        System.out.println("our fraze is:\t" + array.toString());
    }
}
