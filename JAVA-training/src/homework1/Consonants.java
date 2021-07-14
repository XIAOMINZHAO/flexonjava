package homework1;

import java.util.ArrayList;
import java.util.Scanner;

public class Consonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		replaceConsonants(s);

	}
	
	public static int replaceConsonants(String s) {
		ArrayList<Character> vowels = new ArrayList<Character>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		String str = "";
		int count = 0;
		for(int i = 0; i< s.length();i++) {
			if(vowels.contains(s.charAt(i)) || s.charAt(i) == ' ') {
				str += s.charAt(i);
				
				
			}
			else {
				str += "*";
				count ++;
			}
		}
		System.out.println(str);
		return count;
		
	}

}
