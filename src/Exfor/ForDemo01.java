package Exfor;

import java.util.Scanner;

public class ForDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ű����� �ܼ��� �Է¹޾� 1~9���� ���� ���ϼ���
		
		//����
		Scanner scan = new Scanner(System.in);
		int dan = 0, result = 0;
		
		
		//�Է�
		System.out.print("�ܼ��� �Է��ϼ���.");
		dan = Integer.parseInt(scan.next());
		
		

		//ó�� �Ǵ� ���
		
		System.out.println(dan + "�� ���");
		for(int i=1; i<=9; i++) {
			//ó���� ����
			result = dan * i; //ó��
			System.out.println(dan + " * "+ i + " = " + result);
			//ó���� ����
		}
	}  // end of main(String[] args)
} // end of Class
