package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[] = new int[30];
        int max = 0;
        int min = 200_002;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Random rnd = new Random();
            arr[i] = rnd.nextInt(100_000) + 100_000;
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
            sum +=arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n" + "Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("Task 2");
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");
        System.out.println("Средняя сумма трат за месяц составила " + sum/30 + " рублей.");
        System.out.println("Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >=0; i--)
            System.out.print(reverseFullName[i]);

    }

}
