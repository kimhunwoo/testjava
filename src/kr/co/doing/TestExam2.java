/*
 *  �ܼ� �Է� : Scanner Ŭ����
 *  Ű����(�ܼ�)�� ���ڸ� �Է¹޾Ƽ� ���
 */
package kr.co.doing; // ������ �ҽ� ������

import java.util.Scanner;

// public:���,��� private : ������(ȥ��), �ٸ������� ����������.
public class TestExam2 {

	// static : ������, ������ -> �޸𸮿� �ε尡 �Ǿ �ٷ� ȣ�Ⱑ�� 
	public static void main(String[] args) {
		// �μ��� �Է�(���ڿ�->����)�޾Ƽ� ����غ���
		//����  
		Scanner scan = new Scanner(System.in);
		int num1 = 0;  // =  ���� ������
		int num2 = 0;
		//�Է�
		System.out.print("ù��° ���� �Է�");
//		System.out.print("ù��° ���� �Է�");  // ���ʿ��� ����
		num1 = Integer.parseInt(scan.next());
		
		System.out.print("�ι�° ���� �Է�");
		num2 = scan.nextInt();
		//ó��
		
//		�ּ�ó�� ����Ű  : ctrl + /
		//���
	    System.out.println("�Է¹��� ����1 : " + num1);
	    System.out.println("�Է¹��� ����2 : " + num2);
	}

}
