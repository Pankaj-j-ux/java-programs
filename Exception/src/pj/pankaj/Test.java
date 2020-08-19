package pj.pankaj;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {

        try {
            methodA();
            System.out.println("Exit main()");
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException caught ...");
            ex.printStackTrace();
        }

        System.out.println("Even after Exception thee program will run only if the Exception is caught properly.");
    }

    static void methodA() {
        System.out.println("Enter methodA()");
        int a = 5, b = 0;
        int c = a / b;
        System.out.println(c);
    }
}