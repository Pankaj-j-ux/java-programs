package pj.pankaj;

import java.util.Scanner;

public class Anagram2 {
    public static void main(String[] args) {
        int[] a1 = new int[256];
        int[] a2 = new int[256];
        boolean isAnagram = false;

        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER SRTING 1 : ");
        String str1 = sc.nextLine();
        System.out.print("ENTER SRTING 2 : ");
        String str2 = sc.nextLine();

        for (int i=0;i<str1.length();i++) {
            int a= (int) str1.charAt(i);
            a1[a]++;
        }
        for (int i=0;i<str2.length();i++) {
            int a= (int) str2.charAt(i);
            a2[a]++;
        }
        for (int i=0;i<256;i++) {
            if (a1[i]!= a2[i]) {
                isAnagram=false;
                break;
            } else {
                isAnagram = true;
            }
        }
        if(isAnagram) {
            System.out.println("ANAGRAM");
        } else {
            System.out.println("NOT ANAGRAM");
        }
    }
}
