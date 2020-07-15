package pj.pankaj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER FIRST STRING : ");
	    String str1 = sc.nextLine();
        System.out.print("ENTER SECOND STRING : ");
        String str2 = sc.nextLine();
        boolean isAnagram = false ;
        boolean visited[] =new boolean[str2.length()];

        if (str1.length()==str2.length()) {

            for (int i = 0; i < str1.length(); i++) {
                char c = str1.charAt(i);
                isAnagram = false;
                for (int j = 0; j < str2.length(); j++) {
                    if (str2.charAt(j) == c && !visited[j]) {
                        isAnagram = true;
                        visited[j]=true;
                        break;
                    }
                }
                if (!isAnagram) {
                    break;
                }
            }
        }
        if(isAnagram) {
            System.out.println("ANAGRAM");
        } else {
            System.out.println("NOT AN ANAGRAM");
        }
    }
}
