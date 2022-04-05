package com.java.practice;
import java.util.*;

public class StackDemo {

        public static void main(String args[]){
            Stack s = new Stack();
            s.push(5);
            s.push("AAAA");
            s.push(9);
            System.out.println(s.pop());

            int a = 3 ;
            int b = 4 + a / 2 ;
            int c = b % 3 ;
            System.out.println(c);

        }
}


