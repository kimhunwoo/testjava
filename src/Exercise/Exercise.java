package Exercise;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		
		for(int i=1; i<=20; i ++) {
			if(i%2 != 0 && i %3 != 0) { // 2�� ����� �ƴϰ� 3�� ����� �ƴ�
				sum = sum + i;
			}
		}
		System.out.println("sum =" + sum);
// 		System.out.printf("sum = %d \n", sum);  %c, %s
	}

}
