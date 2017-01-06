package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Random r = new Random();
		int k = r.nextInt(100) + 1;
		
		int min = 1;
		int max = 100;
		
		System.out.println("수를 결정하였습니다. 맞추어 보세요");
		while(true){
			int i = 1;
			System.out.println(min + "-" + max);
			System.out.print(i + ">>");
			int num = scanner.nextInt();
			if(num > max || num < min){
				System.out.println("범위를 초과했습니다. 다시 입력하십시오.");
				System.out.println(min + "-" + max);
				System.out.print(i + ">>");
				num = scanner.nextInt();
			}
			if(num == k){
				System.out.println("맞았습니다.");
				break;
			}else if(num < k){
				min = num;
				System.out.println("더 높게");
			}else{
				max = num;
				System.out.println("더 낮게");
			}
			i++;
		}
		
		while(true){
			System.out.print("다시 하시겠습니까(y/n)>> ");
			String answer = scanner.next();
			if(answer.equals("y")){
				main(args);
			}else if(answer.equals("n")){
				break;
			}else{
				System.out.println("잘 못 입력하셨습니다.");
				continue;
			}
		}
		
	}
}