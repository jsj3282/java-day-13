package day13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test29 {
	public static void main(String[] args) throws Exception {
		// �������α׷�
		// 90������ʹ� ���ԺҰ�
		// 90��� �̸��� ���԰���
		// A, ��, ��, ���ʳ�... �̷��� �� �Է½� '�߸��Է� �����Է�' �������

		// Scanner input = new Scanner(System.in);
		// System.out.print("�¾ �⵵�� �Է����ּ��� : ");
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("�¾ �⵵�� �Է����ּ��� : ");
			int bornYear = input.nextInt();
			if (bornYear <= 90) {
				System.out.println("���԰���");
			} else if (bornYear > 90) {
				System.out.println("���ԺҰ�");
			} else {
				System.out.println(bornYear);
				throw new Exception("�߸��Է� �����Է�");
			}
		} catch (InputMismatchException e) {
			System.err.println(e);
			System.out.println("�߸��Է� �����Է�");
		} catch(ArithmeticException e) {
			
		}//InputMismatchException
	}
}
