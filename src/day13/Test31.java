package day13;

import java.util.Scanner;

public class Test31 {

	public static void main(String[] args) {
		
		
		 Scanner input = new Scanner(System.in);
	      String age;
	      System.out.print("���� �Է�(�ֹι�ȣ���ڸ��Է�) : ");
	      try{
	         age = input.next();
	         for(int i=0;i<age.length();i++){ 
	            if(age.charAt(i)<48 || age.charAt(i)>57) {
	               throw new Exception("���ڸ� �Է��ϼ���!!");
	            }
	         }
	         if(age.length() == 7)
	            throw new Exception("���̰� Ʋ�Ƚ��ϴ�!!!");
	         if(age.charAt(0)==57) {
	            System.out.println("���ԺҰ�");
	         }else {
	            System.out.println("���԰���");
	         }
	         System.out.println("����� ���̴� "+age);
	      }catch(Exception e){
	         System.out.println(e.getMessage());
	      } 

	}

}
