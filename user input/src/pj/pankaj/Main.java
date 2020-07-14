package pj.pankaj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        sc.nextLine();
//        String y = sc.nextLine();
//
//        System.out.println(x +" "+y);

        boolean z = sc.hasNextInt();
        if(z) {
            System.out.println("NUMBER INPUTED IS AN INTEGER");
        } else {
            System.out.println("INVALID ENTRY");
        }
        sc.nextLine();

        boolean k = sc.hasNextLine();
        if(k) {
            System.out.println("VALID");
        }

        sc.close();
    }


}
