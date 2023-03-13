package com.liahov.task2.complex;

public class ComplexTest {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(2, 1);
        ComplexNumber b = new ComplexNumber(4, -1);

        ComplexNumber c = a.add(b);
        System.out.println(c);

        ComplexNumber d = a.subtract(b);
        System.out.println(d);

        ComplexNumber e = a.multiply(b);
        System.out.println(e);

        double moduleA = a.module();
        System.out.println(moduleA);

        String strB = b.toString();
        System.out.println(strB);
    }
}

