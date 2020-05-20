package day13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test29 {
	public static void main(String[] args) throws Exception {
		// 인증프로그램
		// 90년생부터는 가입불가
		// 90년생 미만은 가입가능
		// A, ㅁ, ㅋ, 구십년... 이러한 값 입력시 '잘못입력 숫자입력' 문구출력

		// Scanner input = new Scanner(System.in);
		// System.out.print("태어난 년도를 입력해주세요 : ");
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("태어난 년도를 입력해주세요 : ");
			int bornYear = input.nextInt();
			if (bornYear <= 90) {
				System.out.println("가입가능");
			} else if (bornYear > 90) {
				System.out.println("가입불가");
			} else {
				System.out.println(bornYear);
				throw new Exception("잘못입력 숫자입력");
			}
		} catch (InputMismatchException e) {
			System.err.println(e);
			System.out.println("잘못입력 숫자입력");
		} catch(ArithmeticException e) {
			
		}//InputMismatchException
	}
}
