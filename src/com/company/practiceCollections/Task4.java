package com.company.practiceCollections;

import java.util.*;

public class Task4 {
    //Дан List, который содержит дубликаты, необходимо избавиться от них.
    public static void main(String[] args) {
        Random random = new Random();
        List <Integer> list = new ArrayList<Integer>();
        for (Integer i = 0; i < 12; i++) {
            list.add(random.nextInt(6));
        }
        System.out.println(list);
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))){
                    list.remove(j);
                    j--;
                }
            }
        }
        System.out.println(list);
    }
}
