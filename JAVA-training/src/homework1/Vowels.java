package homework1;

import java.util.ArrayList;
import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		countVowels(s);
		
		

	}
	
	public static int countVowels(String s) {
		
		ArrayList<Character> vowels = new ArrayList<Character>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		int count = 0;
		for (int i = 0 ; i< s.length(); i++) {
			if(vowels.contains(s.charAt(i))) {
				count ++;
			}
			else {
				
			}
			
		}
		System.out.println(count);

		return count;
		
		
	}

}
