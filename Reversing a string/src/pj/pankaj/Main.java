package pj.pankaj;

import java.io.StringReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	Reverse reverseString =new Reverse();
		System.out.println(reverseString.reverse("i am pankaj"));
//	    Scanner sc =new Scanner(System.in);
//	    String line = sc.nextLine();
//	    String line = "i am pankaj";
//		String output = "";
//	    int j=line.length()-1;
//		int i=line.length()-1;
//
//
//	    for (i=line.length()-1;i>=0;i--) {
//	    	if (line.charAt(i)==' ') {
//	    		j=i;
//	    		continue;
//	    	}
//
//	    	while (line.charAt(i) != ' ') i--;
//	    	if (output.isEmpty()) {
//				output = output.concat(line.substring(i + 1, j));
//			} else {
//			output = output.concat(" " + line.substring(i+1,j));
//			}
//	    }

//		Scanner sc = new Scanner(System.in);
//		String l = sc.nextLine();
//		System.out.println(l);

//		System.out.println(reverseString("i am pankaj"));
    }

//     static String reverseString(String s) {
//    	int i = s.length()-1;
//    	String ans = "";
//    	while (i >=0) {
//			while (i >= 0 && s.charAt(i) == ' ') i--;
//			int j = i;
//			if (i < 0) break;
//			while (i >= 0 && s.charAt(i) != ' ') i--;
//
//			if (ans.isEmpty()) {
//				ans =ans.concat(s.substring(i + 1, j + 1));
//			} else {
//				ans =ans.concat(" " + s.substring(i+1,j+1));
//			}
//    	}
//    	return ans ;
//    }
}
