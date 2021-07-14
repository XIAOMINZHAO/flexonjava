 package homework1;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		isPalindrome(s);

	}
	
	public static boolean isPalindrome(String s) {
		
		String str = "";
		for(int i = 0; i< s.length(); i++) {
			str = s.charAt(i) + str;
		}
		System.out.println(s.equals(str));
		return s.equals(str);
		
 	}

} 
