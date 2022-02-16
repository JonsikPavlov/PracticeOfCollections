package com.company.practiceCollections;

import java.util.*;

public class Task8 {
    /* Ввести текст с клавиатуры. Для текста создать Map, где ключом будет слово,
     * а значение – количество повторений этого слова в тексте(частотный словарь).
     * Можно использовать метод String.split для разделения строки на слова.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your text:");
        String text = scanner.nextLine();
        text.trim();
        String[] arrText = text.split(" ");
        Map<String, Integer> words = new HashMap<>();
        int i = 0;
        for (String word: arrText) {
//            System.out.println(word);
            for (String duplicate: arrText){
                if ( word.equals(duplicate)){
                    i++;
                }
            }
            words.put(word, i);
            i = 0;
        }
        System.out.println(words);
    }
}
