package day13;

public class Test27 {

	public static void main(String[] args) {
		
		int num = 100;
		String st;
//		st = num;   에러발생
		st = num + "";
		System.out.println(st);
		st = num + " 입니다";
		System.out.println(st);

	}

}
