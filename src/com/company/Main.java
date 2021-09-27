package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        double[] someVector = {1.45, 3.56, 2.65, 1.56, 2.12};
        int length = 5;
        var vector = new Vector(length);

        System.out.print("Введите значения векторa: ");
        for (int i = 0; i < length; ++i) {
            vector.setValue(i, scanner.nextDouble());
        }

        System.out.println(vector.getValue());

        System.out.println( "Длина вектора:" + vector.getLength());

        System.out.println("Минимальное значение массива: " + vector.getMin());
        System.out.println("Максимальное значение массива: " + vector.getMax());

        vector.sort();
        System.out.println("Массив после сортировки: " + Arrays.toString(vector.getValue()));

        System.out.println("Евклидова норма: " + vector.EvkNorm());

        System.out.println("Умножение вектора на число" + Arrays.toString(vector.multiple(2)));
        System.out.println("Умножение вектора на число" + Arrays.toString(vector.multiple(2)));

        System.out.println("Сложение двух векторов: " + Arrays.toString(vector.sum(someVector)));

        System.out.println("Скалярное произведение векторов: " + vector.scalarMultiple(someVector));
    }
}