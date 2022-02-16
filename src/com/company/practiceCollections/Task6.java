package com.company.practiceCollections;

import java.util.*;

public class Task6 {
    //Написать метод, который принимает строку и возвращает коллекцию, содержащую уникальные буквы в слове.
    public static void main(String[] args) {
        System.out.println(uniqueCharacters("array"));
    }

    public static Collection<String> uniqueCharacters(String word) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < word.length(); i++) {
            String chars = word.valueOf(word.charAt(i));
            list.add(chars);
        }
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))){
                    list.remove(j);
                    j--;
                }
            }
        }
        return list;
    }
}
