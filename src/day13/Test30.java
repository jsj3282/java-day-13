package day13;

import java.util.InputMismatchException;
import java.util.Scanner;

class Auth{
	private String age;
	public String getAge(){ return age; }
	public int check(int age){
		this.age = age+"";
		if(this.age.length() == 6){
			if(this.age.charAt(0)<'9')
				return 0;
			else
				return 1;	
		}else{
			return -1;
		}
	}
	public int inputAge(){
		Scanner input = new Scanner(System.in);
		int age;
		String chkAge;
		System.out.print("나이 입력 : ");
		try{
			age=input.nextInt();
			return age;
		}catch(InputMismatchException e){
			System.err.println("숫자를 입력 하세요!!!");
			return -1;
		}
	}
	public void display(){
		int boo=1;
		System.out.println("인증 프로그램 입니다.");
		int age=-1;
		while(boo != 0){	
			age = inputAge();
			if(age != -1)
				boo=check(age);
			if(boo == 0) {
				System.out.println("가입 가능");
			}else if( boo == 1) {
				System.out.println("가입 불가");
			}else {
				System.out.println("길이가 틀렸습니다");
			}
		}
	}
}
public class Test30 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Auth au = new Auth();
		au.display();
		System.out.println("프로그램 종료");

	}

}
