package pj.pankaj;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {

        System.out.println("ENTER THE NUMBER");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int num=0;
        for(int i=1;i<=n;i++) {

            for(int j=1;j<=n-i;j++) {
                System.out.print("  ");
            }

            for(int j=1;j<=i;j++) {
                System.out.print(++num +"   ");
            }
            System.out.println();
        }
    }

}
