/*
 * 100��¥�� 1���� �迭�� �����ϰ�
 * for���� �̿��Ͽ� 1~100���� 100���� ���� �Է��ϰ�
 * �Էµ� 100���� ���� �� 4�� ������� �հ� 4�� ����� ����� ���ϱ�.
 */
package Array;

import java.util.Scanner;

public class EX04_Array_1Tol100Sum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("�迭�� ���� �Է� : ");
		int N = scan.nextInt();
		
		int[] num = new int [N]; // �迭 ���� �� ����
		int sum4 = 0; // 4�� ����� ��
		int count = 0; // 4�� ��� ī����
		
		// �Է�
		for(int i=0; i<num.length; i++) {
			num[i] = i + 1;
		}
		// ó��
		for(int i=0; i<num.length; i++) {
			if(num[i] % 4 == 0) { // 4�� ����̸�
				sum4 = sum4 + num[i]; //  ��
				count++; // ���� ����
			
			}
		}
		//���
		System.out.println("4�� ����� �� : " + sum4);
		System.out.println("4�� ����� ���� : " + count);
		}	
}
	