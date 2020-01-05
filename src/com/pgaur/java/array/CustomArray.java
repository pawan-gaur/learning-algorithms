package com.pgaur.java.array;

public class CustomArray {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.print();
        numbers.removeAt(2);
        System.out.println("after removing an element");
        numbers.print();
        System.out.println("Index Of : "+numbers.indexOf(50));
    }
}
