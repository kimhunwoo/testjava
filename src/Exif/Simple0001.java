/*
 *  Ű����� ������ �Է¹޾Ƽ� ¦������ Ȧ������ ���
 */
package Exif;

import java.util.Scanner;

public class Simple0001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ����
		Scanner scan = new Scanner(System.in);
        int num1 = 0;
        //�Է�
        System.out.print("���ڸ� �Է��ϼ��� :");
        num1 = scan.nextInt();
        // ó�� num1 % 2 => ���������� 1�̸� Ȧ��
//        if(���ǹ�)
        if(num1 % 2 == 1) {
        	System.out.println("Ȧ��");
        }else {
        	System.out.println("¦��");
        }
        System.out.println("Program End!");
        
        
	}

}
