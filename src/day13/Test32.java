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
		System.out.println("���� ���α׷� �Դϴ�.");
		System.out.print("���� �Է� : ");
		String userAge = sc.nextLine();
		Func f = new Func(userAge);
		if(f.checkLen(userAge)==1) {
			if(f.compare(userAge)==1) {
				System.out.println("���� ����");
			}else {
				if(f.compare(userAge)==0) {
					System.out.println("���� �Ұ�");
					f.exit();
				}
			}
			if(f.compare(userAge)==-1) {
				System.out.println("���ڸ� �Է��ϼ���");
				f.exit();
			}			
		}else {
			System.out.println("���̰� Ʋ�Ƚ��ϴ�.");
			f.exit();
		}

	}

}
