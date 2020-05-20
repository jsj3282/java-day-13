package day13;

public class Test17 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3};
		try {
			for(int i=0; i<5; i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}

	}

}
