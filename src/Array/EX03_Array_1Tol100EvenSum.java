/*
 * 100��¥�� 1���� �迭�� �����ϰ�
 * for���� �̿��Ͽ� 1~100���� 100���� ���� �Է��ϰ�
 * �Էµ� 100���� ���� �� ¦������ �� ���ϱ�.
 */
package Array;

import java.util.Scanner;

public class EX03_Array_1Tol100EvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[100];
		int sum = 0;
		System.out.println("���� 1~100�� �ԷµǾ����ϴ�.");
		
		for(int i=0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		// i�� �ʱ�ȭ                                  cf) for(;;) {  <=>  while(true){ ���ѷ���
 		for(int i=0; i < arr.length; i++) {	
			if(arr[i] % 2 == 0) {
				sum = sum + arr[i];
			}
		}		
			System.out.println("1~100������ ¦������ ���� " + sum + " �Դϴ�.");
			
			
		}
			
		
		
		
		
		
		
	}

