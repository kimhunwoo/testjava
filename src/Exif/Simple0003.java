/*
 * ���̸� Ű����� �Է¹޾Ƽ�
 * 60���̻��̸� "����"
 * 60���̸� 40���̻��̸� "�߳�"
 * 40���̸��̸� "û�ҳ�"�� ����ϴ� ���α׷����ϱ�.
 * 
 * "����� ���̴� 00�̰� 000�Դϴ�."
 */
package Exif;

import java.util.Scanner;

public class Simple0003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����
        Scanner scan = new Scanner(System.in);
        int num1 = 0;
        String str = ""; 
        
        //�Է�
        System.out.print("���̸� �Է����ּ���");
        num1 = Integer.parseInt(scan.next());
        
        //ó��
        if(num1>=60) { //60�̻�
        	str = "����";
        }else if(num1>=40) { //60���̸� 40�� �̻�
        	str = "�߳�";
        }else { // 40���̸�
        	str = "û�ҳ�";       
        }
        
        System.out.println("����� ���̴� " + num1 + "�̰� " + str + "�Դϴ�.");
        
        
	}

}
