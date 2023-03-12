package com.liahov.task2.sequences;

import java.util.Arrays;

public class SequencesImpl implements SequenceGenerator {

    @Override
    public void a(int n) {//A. 2, 4, 6, 8, 10
        int[] arr = new int[n + 1];
        arr[0] = 2;
        arr[1] = 4;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 2;
        }
        System.out.println(Arrays.toString(arr));
    }

    @Override
    public void b(int n) {//B. 1, 3, 5, 7, 9
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 3;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 2;
        }
        System.out.println(Arrays.toString(arr));

    }

    @Override
    public void c(int n) {//C. 1, 4, 9, 16, 25
        int[] arr = new int[n + 1];
        int count = 3;
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + count;
            count = count + 2;
        }
        System.out.println(Arrays.toString(arr));

    }

    @Override
    public void d(int n) {//D. 1, 8, 27, 64, 125
        for (int i = 1; i <= n; i++) {
            int res = (int) Math.pow(i, 3);
            System.out.print(res + " ");
        }
        System.out.println();
    }


    @Override
    public void e(int n) {//E. 1, -1, 1, -1, 1, -1

        int num = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(num + " ");
            num = -num; // меняем знак
        }
    }


    @Override
    public void f(int n) {//F. 1, -2, 3, -4, 5, -6

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(-i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }


    @Override
    public void g(int n) {//G. 1, -4, 9, -16, 25

        int link = 1;
        for (int i = 1; i <= n; i++) {
            int num = i * i;
            if (link == 1) {
                System.out.print(num + " ");
            } else {
                System.out.print(-num + " ");
            }
            link = -link;
        }
        System.out.println();
    }


    @Override
    public void h(int n) {//H. 1, 0, 2, 0, 3, 0, 4
        int zero = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i / 2 + 1 + " ");
            } else {
                System.out.print(zero + " ");
            }
        }
        System.out.println();
    }


    @Override
    public void i(int n) {//I. 1, 2, 6, 24, 120, 720
        int num = 1;
        for (int i = 1; i <= n; i++) {
            num *= i;
            System.out.print(num + " ");
        }
        System.out.println();
    }


    @Override
    public void j(int n) {//J. 1, 1, 2, 3, 5, 8, 13, 21
        long[] arr = new long[n + 1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(Arrays.toString(arr));
    }
}

