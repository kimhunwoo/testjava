/* 10���� ���������� �Է��ϼ���.
 * korJumsu
 */
package Array;

import java.util.Arrays;
import java.util.Scanner;

public class EX01_ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] korJumsu = new int[3];
		int sum = 0;
		System.out.println("korJumsu �迭�� ���� : " + korJumsu.length);
		
		//�迭�� �� �Է��غ���
		for(int i=0; i<korJumsu.length; i++) {
			System.out.print(i+"��° �����Է� - ");
			korJumsu[i] = scan.nextInt();
			sum = sum + korJumsu[i];
		}
		// �迭�� �� ����غ���
		System.out.println("===[korJumsu�迭�� �� ���]===");
//		System.out.println(korJumsu[0]);
//		System.out.println(korJumsu[1]);
//		System.out.println(korJumsu[2]);
		for(int i=0; i<korJumsu.length; i++) {
			System.out.println(korJumsu[i]);
		}
		//�Ǵٸ� ���.
		System.out.println(Arrays.toString(korJumsu));
		
		System.out.println("korJumsu�迭�� �� : " + sum);
		
		
		System.out.println("end");
	}

}
