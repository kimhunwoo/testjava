/*
 * 1 + (1+2) + (1+2+3) + ...(1+2+3+..+10)
 *
 */
package Exercise;

public class Exercise4_3 {

	public static void main(String[] args) {
		int sum = 0; // ��
		int totalSum = 0; // ���� ��
		
		for(int i=1; i<=10; i++) {
			sum = sum + i;  // (1+2+...10), i�� ���� ������
			totalSum = totalSum + sum; //sum�� ���� ������
		}
	}
}


