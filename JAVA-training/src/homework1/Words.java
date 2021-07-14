package homework1;

import java.util.Scanner;

public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		countWords(s);
		

	}
	
	public static int countWords(String s) {
		s = s.replaceAll(" ", "");
		System.out.println(s.length());
		return s.length();
		
		
	}

}
