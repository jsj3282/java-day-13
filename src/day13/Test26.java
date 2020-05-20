package day13;

import java.util.Scanner;

public class Test26 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int age;
		System.out.println("나이 입력");
		try {
			age = input.nextInt();
			if(age<=0) {
				throw new Exception("나이 잘못 입력" + age);
			}
			System.out.println("당신의 나이는 " + age);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
