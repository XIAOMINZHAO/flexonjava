 package homework1;

import java.util.Scanner;

public class LastLetterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		lastLetterCount(s);

	}
	
	public static int lastLetterCount(String s) {
		int countS = 0;
		int countY = 0;
		
		String[] str = s.split(" ");
		
		
		String wordEndins = "";
		String wordEndiny = "";
		for(String w : str) {
			if(w.endsWith("s")) {
				countS ++;
				if(countS == 1) {
					wordEndins = w;
				}
			}
			else if(w.endsWith("y")) {
				countY ++;
				if(countY == 1) {
					wordEndiny = w;
				}
			}
		}

		String newStr = "";
		boolean Schange = true;
		boolean Ychange = true;
        for(int i = 0; i< str.length;i++) {
			
			if(str[i].equals(wordEndins)  && Schange) {
				newStr = newStr + " " + wordEndiny;
				Schange = false;
				
			}
			else if(str[i] == wordEndiny && Ychange) {
			
				newStr = newStr + " " + wordEndins;
				Ychange = false;
				
			}
			else {
				
				newStr = newStr + " " + str[i];
			}
		}
		
		
		System.out.println(newStr);

		return countS+countY;
		
		
	}

}
