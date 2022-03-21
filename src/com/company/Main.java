package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        task6(); task7(); task8_9();
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

    System.out.println("\n" + "Task 5");
    int [][] matrix = new int [3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = 1;
                System.out.print(matrix[j][i] + " ");
            }
           System.out.println();

        }
    }
    public static void task6 (){
        int arr[] = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        int arr2[] = new int [arr.length];
        for (int i = arr.length-1, j = 0; i >=0; i--, j++){
            arr2[j] = arr[i];
            System.out.print(arr2[j]+ " ");
        }
        System.out.println();

    }
    public static void task7(){
        int arr3[] = {5, 4, 3, 2, 1};
        for (int i = arr3.length -1; i >= 0; i --){
            System.out.print(arr3[i] + " ");
        }
    }
    public static void task8_9 (){
    int [] arr =  {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
    int sum;
    System.out.println();
    for (int i = 0; i < arr.length; i++){
       for (int j = 0; j < arr.length; j++){
           sum = arr[i] + arr[j];
                   if (sum == (-2)){
                       System.out.println(arr[i] + " " + arr[j]);
                   }
       }
    }

    }
    }


