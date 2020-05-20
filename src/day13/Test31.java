package day13;

import java.util.Scanner;

public class Test31 {

	public static void main(String[] args) {
		
		
		 Scanner input = new Scanner(System.in);
	      String age;
	      System.out.print("나이 입력(주민번호앞자리입력) : ");
	      try{
	         age = input.next();
	         for(int i=0;i<age.length();i++){ 
	            if(age.charAt(i)<48 || age.charAt(i)>57) {
	               throw new Exception("숫자를 입력하세요!!");
	            }
	         }
	         if(age.length() == 7)
	            throw new Exception("길이가 틀렸습니다!!!");
	         if(age.charAt(0)==57) {
	            System.out.println("가입불가");
	         }else {
	            System.out.println("가입가능");
	         }
	         System.out.println("당신의 나이는 "+age);
	      }catch(Exception e){
	         System.out.println(e.getMessage());
	      } 

	}

}
