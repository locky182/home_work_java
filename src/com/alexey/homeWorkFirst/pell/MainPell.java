package com.alexey.homeWorkFirst.pell;

import java.util.Scanner;

public class MainPell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of Pell: ");
        int num = scanner.nextInt();
        System.out.println(numOfPell(num));

    }

    public static int numOfPell(int num) {
        int[] arr = new int[num + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[0] = 0;
            arr[1] = 1;
            if (i > 1) {
                arr[i] = 2 * arr[i - 1] + arr[i - 2];
            }
        }
        return arr[num];
    }
}
