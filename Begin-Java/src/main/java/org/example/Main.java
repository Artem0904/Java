package org.example;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


    }

    public static void simple(){
        int n;
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter length of array: ");
        System.out.println("->_");
        n = cin.nextInt();
        System.out.println("Number: " + n);
        int min = 0;
        int max = 100;

        int [] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = randValue(min, max);

        for (int i : array)
            System.out.printf("%d\t",i);
        System.out.println();

        int count =0;
        int i = 0;
        while(i < n){
            if(array[i] > 45)
                count++;
            i++;
        }
        System.out.printf("Numbers above 45: %d\n", count);
    }

    public static int randValue(int min, int max){
        Random random = new Random();

        return random.nextInt((max - min) + 1) + min;
    }

}