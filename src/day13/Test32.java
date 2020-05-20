package day13;

import java.util.Scanner;

class Func {
	private String age;
	private final int base = 900101;
		
	public Func(String age) {
		this.age = age;
	}
	
	public String getAge() {
		return age;
	}
	

	public int checkLen(String age) {
		if(age.length()==6) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public int compare(String age) {
		try {
			if(Integer.parseInt(age) <= base) {
				return 1;
			}else {
				return 0;
			}
		}catch(Exception e) {
			return -1;
		}
		
	}
	
	public void exit() {
		System.exit(0);
	}

}

public class Test32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("인증 프로그램 입니다.");
		System.out.print("나이 입력 : ");
		String userAge = sc.nextLine();
		Func f = new Func(userAge);
		if(f.checkLen(userAge)==1) {
			if(f.compare(userAge)==1) {
				System.out.println("가입 가능");
			}else {
				if(f.compare(userAge)==0) {
					System.out.println("가입 불가");
					f.exit();
				}
			}
			if(f.compare(userAge)==-1) {
				System.out.println("숫자를 입력하세요");
				f.exit();
			}			
		}else {
			System.out.println("길이가 틀렸습니다.");
			f.exit();
		}

	}

}
