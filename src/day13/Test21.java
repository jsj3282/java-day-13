package day13;

class Excep{
	public void exc() {
		System.out.println("무조건 실행할 코드");
	}
}
public class Test21 {

	public static void main(String[] args) {
		
		int x = 10, y = 0, result = 0;
		Excep excep = new Excep();
		try {
			result = x / y;
			System.out.println(x + "/" + y + "=" + result);
		}catch(Exception e) {
			System.out.println("나눌 수 없습니다.");
		}finally{
			excep.exc();
			System.out.println("종료하겠습니다.");
		}

	}

}
