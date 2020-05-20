package main;

import java.util.Scanner;

import time.*;
import win7.*;

public class Main {

	public static void main(String[] args) {
		boolean flag = true;
		while (flag) {
			System.out.println("1. 타임 클래스 사용");
			System.out.println("2. 윈7 클래스 사용");
			System.out.println("3. 종료");
			System.out.print(">>> ");
			Scanner input = new Scanner(System.in);
			int num = input.nextInt();
			switch (num) {
			case 1:
				time.TimerQuiz tim = new time.TimerQuiz();
				tim.time();
				break;

			case 2:
				win7.Win7Quiz win7 = new win7.Win7Quiz();
				win7.display();
				break;
			case 3:
				System.out.println("시스템 종료");
				flag = false;
			}
		}
	}
}
