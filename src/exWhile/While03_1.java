package exWhile;

import java.util.Scanner;

public class While03_1 {

	static Scanner scan = new Scanner(System.in);  // ��������(Ÿ��)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean done = true; // ���ᰡ �Ǹ� false
		int sel = 0; // �޴������� - ����, �׸�, �ʵ�, ������, �Ķ����, �Ű�����, ����
		int num1 = 0, num2 = 0; // �� ��
		while(done) {
			// �޴����̱�  -> �޼ҵ�� 	// �ַܼ� �Է°����̱�

			sel = menuPrint();
			
			// �μ� �Է��� �ޱ�
			if(sel >= 1 && sel <= 4) { // 1, 2, 3, 4�϶� �μ� �Է��� �ޱ�.
				System.out.println("First Number : ");
				num1 = scan.nextInt();
				System.out.println("Second Number : ");
				num2 = scan.nextInt();
			}
			
			switch(sel) {
			// case 3, 4, 5:
			
			case 1: // ���� ���ϴ� �޼ҵ� -> ������ �߰�
				int sum = sum(num1, num2);
				System.out.println(sum);
//			  	sum();
				break;
			case 2: // ���� -> ������ ����
				int minus = minus(num1, num2);
				System.out.println(minus);	
				break;
			case 3: // ���� -> ������ ��ȸ
				int mul= mul(num1, num2);
				System.out.println(mul);
				break;
			case 4: //������ -> ������ ����
				int div= div(num1, num2);
				System.out.println(div);
				break;
			case 99: //����
				done = false;
				break;
			  
			default : // ���Է�
				System.out.println("1, 2, 3, 4, 99�� �Է����ּ���~");
				break;
		  } //end of swich (�Է�)

		} // end of while (done)
		System.out.println("Program Out!");
		
	} // end of main()

	private static int div(int num1, int num2) {
		// TODO Auto-generated method stub
		int div = num1 / num2;
		
		return div;
	}

	private static int mul(int num1, int num2) {
		// TODO Auto-generated method stub
		int mul = num1 * num2;
		
		return mul;
	}

	private static int minus(int num1, int num2) {
		// TODO Auto-generated method stub
		int minus = num1 - num2;
		
		return minus;
	}

	private static void sum() {
		// TODO Auto-generated method stub
		// �� ���� �Է¹޾Ƽ� ���� ����ϴ� �޼ҵ� 
	}

	private static int sum(int num1, int num2) { // call by value
		int sum = num1 + num2;
//		System.out.println("�� : " + sum);
		return sum; // sum
	}

// �� ���� �Ѱܹ޾Ƽ� ���� ������.	
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
		
		return scan.nextInt();
	}


}