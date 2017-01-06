package prob4;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		
		char[] c = reverse( s );
		printCharArray( c );
		
		scanner.close();
	}
	
	public static char[] reverse(String  str) {
		int j = str.length();
		char[] c = str.toCharArray();
		for(int i = 0; i < str.length(); i++){
			c[i] = str.charAt(j-1);
			j--;
		}
		 return c;
		 
	}

	public static void printCharArray(char[] array){
		for(char c : array){
			System.out.print(c);
		}
		System.out.println();
	}
}
