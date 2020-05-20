package day13;

import java.io.IOException;

public class Test24 {

	public static void main(String[] args) throws IOException {
		
		int num;
		System.out.print("한 자리 수 입력 : ");
		try{
			num = System.in.read() - 48;
			System.out.println("입력한 값 : " + num);
		}catch(IOException e) {
			System.err.println("문제 발생");
		}
	}

}
