package day13;

public class Test20 {

	public static void main(String[] args) {
		
		int x = 10, y = 0, result = 0;
		try {
			result = x / y;
			System.out.println(x + "/" + y + "=" + result);
		}catch(Exception e) {
			System.out.println("나눌 수 없습니다.");
		}finally {
			System.out.println("종료하겠습니다.");
		}

	}

}
