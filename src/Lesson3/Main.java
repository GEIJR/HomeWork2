package Lesson3;

import sun.invoke.empty.Empty;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        // к заданию 1
        int[] num = new int[]{};
        num = new int[]{1, 2, 3, 4, 5, 6, 7};
        swap(num, 1, 4);

        Fruits();// к заданию 2

    }
     //Задание 1
    public static void swap(int[] num, int n1, int n2) {
        System.out.println(Arrays.toString(num));
        int sw = num[n1];
        num[n1] = num[n2];
        num[n2] = sw;
        System.out.println("Рузультат замены мест двух элементов массива: " + Arrays.toString(num) + "\n================================");
    }

    //Задание 2
    public static void Fruits() {
        FruitBox<Apple> appleBox = new FruitBox<>(1.0);
        FruitBox<Orange> orangeBox = new FruitBox<>(1.5);
        FruitBox<Apple> appleBox2 = new FruitBox<>(1.0);

        for (int i = 0; i < 5; i++) {
            orangeBox.addFruit(new Orange());}
         for (int i = 0; i < 8; i++) {
            appleBox.addFruit(new Apple());}
        for (int i = 0; i < 3; i++) {
            appleBox2.addFruit(new Apple());
        }

        System.out.println("Вес первой коробки с яблоками: " + appleBox.getBoxWeight());
        System.out.println("Вес второй коробки с яблоками: " + appleBox2.getBoxWeight());
        System.out.println("Вес корбки с апельсинами: " + orangeBox.getBoxWeight());
        System.out.println("Вес коробок равен? " + appleBox.compare(orangeBox));

        System.out.println("========================================================");

       appleBox.addFruits(appleBox2);

        System.out.println("========================================================");

        System.out.println("Вес второй коробки с яблоками после пересыпания фруктов " + appleBox2.getBoxWeight());
        System.out.println("Вес первой коробки с яблоками после пересыпания фруктов " + appleBox.getBoxWeight());
    }


}


