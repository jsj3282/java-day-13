package day13;

import java.io.IOException;

public class Test24 {

	public static void main(String[] args) throws IOException {
		
		int num;
		System.out.print("�� �ڸ� �� �Է� : ");
		try{
			num = System.in.read() - 48;
			System.out.println("�Է��� �� : " + num);
		}catch(IOException e) {
			System.err.println("���� �߻�");
		}
	}

}
