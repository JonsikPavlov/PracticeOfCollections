package com.company.practiceCollections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Task3 {
    /*Элементы целочисленного массива записать в очередь. Написать функцию извлечения элементов из очереди до тех пор,
    пока первый элемент очереди не станет четным. */
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < array.length; i++) {
            queue.add(array[i]);
        }
        while (queue.element()%2 != 0) {
                queue.remove();
            }
        System.out.println("Queue start with even number:\t" + queue);
    }
}

