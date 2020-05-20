package day13;

import java.util.Scanner;

public class Test19 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] arr = {1, 2, 3};
		int result, num1, num2;
		System.out.println("두 수 입력");
		num1 = input.nextInt();
		num2 = input.nextInt();
		try {
			result = num1 / num2;
			for(int i = 0; i < 5; i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("인덱스 예외");
		}catch(ArithmeticException e) {
			System.err.println("0으로 나눌 수 없습니다.");
		}

	}

}
