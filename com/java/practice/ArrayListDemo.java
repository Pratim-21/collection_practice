package com.java.practice;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String args[]){
        ArrayList a =new ArrayList<>();
        a.add(2);
        a.add(4);
        a.add(8);
        a.add(7);
        System.out.println(a);
        a.set(2,6);
        System.out.println(a);
        a.remove(0);
        System.out.println(a);
    }
}
