package day13;

import java.util.Scanner;

class DB{
	private String con;
	public void setConnect() {
		con = "����";
	}
	public void close() {
		System.out.println("DB�� ������ ������ϴ�.");
		con = null;
	}
	public String getCon() {
		return con;
	}
}
public class Test22 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x = 10, y = 0, result = 0;
		DB excep = new DB();
		System.out.print("�� �Է� : ");
		y = input.nextInt();
		try{
			result = x / y;
			System.out.println("DB�����մϴ�.");
			excep.setConnect();
		}catch(Exception e) {
			System.err.println("DB�� ������ �� �����ϴ�.");
		}finally {
			if(excep.getCon()!=null) {
				excep.close();
			}
		}

	}

}
