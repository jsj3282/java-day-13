package day13;

import java.util.Scanner;

class DB{
	private String con;
	public void setConnect() {
		con = "연결";
	}
	public void close() {
		System.out.println("DB와 연결이 끊겼습니다.");
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
		System.out.print("수 입력 : ");
		y = input.nextInt();
		try{
			result = x / y;
			System.out.println("DB연결합니다.");
			excep.setConnect();
		}catch(Exception e) {
			System.err.println("DB에 연결할 수 없습니다.");
		}finally {
			if(excep.getCon()!=null) {
				excep.close();
			}
		}

	}

}
