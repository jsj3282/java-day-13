package day13;

public class Test18 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3};
		try {
			for(int i = 0; i < 5; i++) {
				System.out.println(arr[i]);
			}
		}catch(Exception e) {
			System.err.println(e);
		}

	}

}
