package Exercise;

public class Exercise4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 34567;
		int sum = 0;
		while(num>0) {
			sum = sum + num % 10; // 7-> 6 -> 5 -> 4 -> 3
			num = num / 10; // 3456 -> 345 -> 34 -> 3 -> 0
		}
		
		System.out.println("sum = " + sum);
	}
	
}
