package day13;

import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x = 0, y = 0, result = 0;
		System.out.println("수 입력");
		x = input.nextInt();
		y = input.nextInt();
		try {
			result = x / y;
			System.out.println("x/y=" + result);
		}catch(ArithmeticException e) {
			System.err.println(e);
		}
		System.out.println("다음 코드 진행");
	}

}
