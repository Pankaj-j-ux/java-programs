package pj.pankaj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF STUDENTS IN YOUR CLASS : ");
        int n =sc.nextInt();
        int marks[] = new int[n];

        for (int i=0;i<marks.length;i++) {
            System.out.print("Enter marks of " + (i+1) + "'s Roll number : ");
            marks[i] = sc.nextInt();
            sc.nextLine();

        }


        System.out.print("PRESS 'P' to print the list of marks: ");

        String z=sc.nextLine();

        if(z.equalsIgnoreCase("p")) {
            for (int i=0;i<marks.length;i++) {
                System.out.println("Roll Number "+ (i+1) +"'s marks : " + marks[i]);
            }
        }
        else {
            System.out.println("THANKYOU for entring data ");
        }


    }
}
