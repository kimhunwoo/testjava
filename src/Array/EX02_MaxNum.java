/*
 *  5��¥�� 1���� �迭�� �����ϰ�
 *  ��ĳ�ʸ� �̿��Ͽ� ���� �ϳ��ϳ� �Է��ϰ�
 *  �Է��� �� �� ���� ū ���� ���Ͻÿ�.
 */
package Array;

import java.util.Scanner;

public class EX02_MaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int[] arr = new int[5];
		int max = 0;   // ū��
		int min = 200; // �������� �Ҷ��� �ʱ�ȭ ���� �����ϼ���. �ִ밪�� �־���� �� 0�� ������ �̹� �ּڰ��̱⿡..
		int i = 0;
		System.out.println(" ���� " + arr.length + "���� �Է��ϼ���.");
		
		for(i=0; i<arr.length; i++) {
			System.out.print(i + " ��° ������ �Է��ϼ���.");
			arr[i] = scan.nextInt();
			
		    if(max < arr[i]) {
		    	max = arr[i];
		    }else if(min>arr[i]) {
		    	min = arr[i];
		    }
			System.out.println("���� ū ���� " + max + " �Դϴ�.");
			
			
			
		}
		
		
		
		
		
		
	}

}
