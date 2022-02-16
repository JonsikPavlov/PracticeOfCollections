package com.company.practiceCollections;

import java.util.ArrayList;
import java.util.List;

public class Task9 {
    /* (* - со звездочкой) Дан массив строк. Необходимо сгруппировать все слова анаграммы в один массив.
     * Анаграмма - слово или фраза сформированная перегруппировкой букв другого слова или фразы,
     * используя каждую букву слова лишь один раз. Например: eat, tea, ate
     * Пример ввода: ["eat","tea","tan","ate","nat","bat"]
     * Пример вывода: [["bat"],["nat","tan"],["ate","eat","tea"]] */
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<String> list = new ArrayList<String>();
        List<String> testList = new ArrayList<String>();
        List<String> anagramList = new ArrayList<String>();
        for (String word : words) {
            list.add(word);
            for (String testWord : words) {
//                testList.add(testWord);
                if (testWord.matches(word)) {
                    anagramList.add(testWord);
                }
                testList.remove(testWord);
            }
            System.out.println(anagramList);
            list.remove(word);
        }
        System.out.println(list);
    }
}
