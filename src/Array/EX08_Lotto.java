/*
 *  �������� ����(1~45)�� �߻����Ѽ� 6���� �ζǹ�ȣ�� �Է��ϱ�
 *  int[] lotto;
 */
package Array;

public class EX08_Lotto {

	public static void main(String[] args) {
		// lotto[] �迭��[idx] == ��
		
		// ����
		int[] lotto = new int[6];
		
		// �迭�� ������ �Է�
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45) + 1;
		}
//		lotto[1] = (int)(Math.random()*45) + 1;
//		lotto[2] = (int)(Math.random()*45) + 1;
//		lotto[3] = (int)(Math.random()*45) + 1;
//		lotto[4] = (int)(Math.random()*45) + 1;
//		lotto[5] = (int)(Math.random()*45) + 1;

		// �迭 ���
		for(int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
			
		}
	}

}
