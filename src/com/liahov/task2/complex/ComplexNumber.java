package com.liahov.task2.complex;

public class ComplexNumber {

    public double firstPart; // действительное
    public double secondPart; // мнимое

    public ComplexNumber(double firstPart) {
        this.firstPart = firstPart;
        this.secondPart = 0;
    }

    public ComplexNumber(double firstPart, double secondPart) {
        this.firstPart = firstPart;
        this.secondPart = secondPart;
    }

    public ComplexNumber add(ComplexNumber other) {
        double otherFirstPart = this.firstPart + other.firstPart;
        double otherSecondPart = this.secondPart + other.secondPart;
        return new ComplexNumber(otherFirstPart, otherSecondPart);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        double otherFirstPart = this.firstPart - other.firstPart;
        double otherSecondPart = this.secondPart - other.secondPart;
        return new ComplexNumber(otherFirstPart, otherSecondPart);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double otherFirstPart = this.firstPart * other.firstPart - this.secondPart * other.secondPart;
        double otherSecondPart = this.firstPart * other.secondPart + this.secondPart * other.firstPart;
        return new ComplexNumber(otherFirstPart, otherSecondPart);
    }

    public double module() {
        return Math.sqrt(this.firstPart * this.firstPart + this.secondPart * this.secondPart);
    }

    @Override
    public String toString() {
        if (this.secondPart == 0) {
            return Double.toString(this.firstPart);
        } else if (this.firstPart == 0) {
            return Double.toString(this.secondPart) + "i";
        } else {
            return Double.toString(this.firstPart) + (this.secondPart > 0 ? "+" : "") + Double.toString(this.secondPart) + "i";
        }
    }
}

