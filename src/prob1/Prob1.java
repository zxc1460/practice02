package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("금액:");
		int price = scanner.nextInt();
		System.out.println();
		
		
		int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		for(int i : money){
			int quot = price / i;
			price = price % i;
			
			if(quot == 0){
				continue;
			}
			
			System.out.println(i + "원: " + quot + "개");
			
			if(price == 0){
				break;
			}
			
			scanner.close();
			
		}
	}
}