/*
 * �μ���
 */
package Exif;

import java.util.Scanner;

public class Simple0004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� ���� A�� B�� �־������� , A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// ù° �� A�� B�� �־�����. 
		
		/*
		 * ù° �ٿ� ���� �� ���� �� �ϳ��� ����Ѵ�.
		 * A�� B���� ū ��쿡�� '>'�� ����Ѵ�.
		 * A�� B���� ���� ��쿡�� '<'�� ����Ѵ�.
		 * A�� B�� ���� ��쿡�� '=='�� ����Ѵ�.
		 * 
		 */
        //����
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		//�Է�

		int A=1; // int num1 = 0;
		int B=0; // int num2 = 0;
		String str = "o";
		//ó��
		if(A==B) {
			str = "==";
		}else if(A>B) {
			str = ">";
		}else {
			str = "<";
		}
	 System.out.println(str);
		
	}

}
