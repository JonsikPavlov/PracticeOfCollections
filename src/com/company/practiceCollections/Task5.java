package com.company.practiceCollections;

import com.sun.deploy.util.StringUtils;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;

public class Task5 {
    // Дан Set слов, необходимо вывести все слова, содержащие 5 букв.
    public static void main(String[] args) {
        Set<String> words = new LinkedHashSet<String>();
        words.add("Crazy");
        words.add("kings");
        words.add("belong");
        words.add("to");
        words.add("vikings");
        words.add("lifestyle");

        for (String word : words) {
            int charCount = word.replaceAll("\\w", " ").length();
            if ( charCount == 5){
                System.out.println(word);
            }
        }
    }
}
