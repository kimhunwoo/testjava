/* �޴� [ �� �� �Է� �޾Ƽ� ��Ģ���� ]
 * 1. �� 2. ���� 3. �� 4. ������ 99. ����
 * 
 */
package exWhile;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean done = true; // ���ᰡ �Ǹ� false
		int sel = 0; // �޴������� - ����, �׸�, �ʵ�, ������, �Ķ����, �Ű�����, ����
		
		while(done) {
			// �޴����̱�  -> �޼ҵ�� 

			sel = menuPrint();
			// �ַܼ� �Է°����̱�
			
			// �μ� �Է��� �ޱ�
			
			if(sel == 1) {
				System.out.println("��");
				
				sum();
			}else if (sel == 2) {
				System.out.println("����");
				minus();
			}else if (sel == 3) {
				System.out.println("��");
				multi();
			}else if (sel == 4) {
				System.out.println("������");
				div();
			}else if (sel == 99) {
				System.out.println("����");
				done = false;
			}else {
				System.out.println("1, 2, 3, 4, 99�� �Է����ּ���");
			}
		}
		
	}

	private static void div() {
		// TODO Auto-generated method stub
		int num1 = 4;
		int num2 = 2;
		int div = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է��ϼ���");
		num1 = scan.nextInt();
		
		System.out.print("�ι�° ���� �Է��ϼ���");
		num2 = scan.nextInt();
		
		div = num1 / num2;
		
		System.out.println("div : " + div);
	}

	private static void multi() {
		// TODO Auto-generated method stub
		int num1 = 3;
		int num2 = 3;
		int multi = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է��ϼ���");
		num1 = scan.nextInt();
		
		System.out.print("�ι�° ���� �Է��ϼ���");
		num2 = scan.nextInt();
		
		multi = num1 * num2;
		
		System.out.println("multi :" + multi);
	}

	private static void minus() {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 3;
		int minus = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է��ϼ���");
		num1 = scan.nextInt();
		
		System.out.print("�ι�° ���� �Է��ϼ���");
		num2 = scan.nextInt();	
		
		minus = num1 - num2;
		
		System.out.println("minus : " + minus);
	}

	private static void sum() {
		// TODO Auto-generated method stub
		int num1 = 1;
		int num2 = 2;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է��ϼ���");
		num1 = scan.nextInt();
		
		System.out.print("�ι�° ���� �Է��ϼ���");
		num2 = scan.nextInt();
		
		sum = num1 + num2;
		
		System.out.println("sum : " + sum);
	}

	private static int menuPrint() {
		// TODO Auto-generated method stub
		System.out.println("=====�޴� [��Ģ����]======");
		System.out.println("1. ��");
		System.out.println("2. ����");
		System.out.println("3. ��");
		System.out.println("4. ������");
		System.out.println("99. ����");
		System.out.println("========================");
		System.out.print("Select Number : ");
		
		return menuPrint();
	}

}
