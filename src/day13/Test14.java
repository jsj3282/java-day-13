package day13;

import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x, y, result;
		System.out.println("�� �Է�");
		x = input.nextInt();
		y = input.nextInt();
		if(y==0) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}else {
			result = x / y;
			System.out.println("x / y => " + result);
		}

	}

}
