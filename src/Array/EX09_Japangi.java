/*
 *  ������ ���� : ���̴�, �ݶ�, Ŀ��
 *  ������ ���� : 500, 500, 1000
 *  ���� ���� : 5, 8, 7
 *  1���� �迭�� �ۼ� : drinkName[3], drinkPrice[3], drinkGa[3]
 *  
 *  [�޴�]
 *  1. ��������
 *  2. ����� ���� => 1. �ݶ� 2. ���̴� 3. Ŀ�� 
 *  3. ���� ���� ����
 *  99. ���Ǳ� ���� (���α׷� ����)
 *  -----------------------------
 *  
 */
package Array;

import java.util.Scanner;

public class EX09_Japangi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String[] drinkName = {"�ݶ�","���̴�","Ŀ��"}; //�������
		int[] drinkPrice = {500, 500, 1000}; //���ᰡ��
		int[] drinkGa = {5,8,7}; //������ ���� ����

		//ó��
		boolean done = false; // ���Ǳ� ��������
		int menu = 0; //�޴� ����Ű
		int selDrink = 0; //���� ����Ű
		
		int money = 0, total = 0; //���Ե� ��, �ݾ� ����
		
		while(!done) {
		
			//�޴� ����
			System.out.println("[�޴�]");
			System.out.println("1. ��������");
			System.out.println("2. ����� ���� => 1. �ݶ� 2. ���̴� 3. Ŀ��");
			System.out.println("3. ���� ���� ����");
			System.out.println("99. ���Ǳ� ����(���α׷� ����)");
			System.out.println("---------------------------------------");
			
			menu = scan.nextInt();
			System.out.print("1���� ������ �ݾ��� �����ϼ��� :");
			money = scan.nextInt();
//			selDrink = scan.nextInt();
//			total = scan.nextInt();
			
			switch(menu) { 
			case 1:
				if(money <=10000) {
					System.out.print(money + "�� �ݾ��� ���ԵǾ����ϴ�.");
				}else 
					System.out.println("�ݾ��� �ٽ� �������ּ���.");
				break;
			case 2:
				System.out.println("����� ���� => 1. �ݶ� 2. ���̴� 3. Ŀ��");
				for(int i = 0; i<drinkName.length; i++) {
					if(drinkName.length == 1) {
						System.out.println(drinkName[0]);
					}else if (drinkName.length == 2 ) {
						System.out.println(drinkName[1]);
					}else
						System.out.println(drinkName[2]);
						drinkName[i] = scan.next();
				}
				break;
			case 3:
				System.out.println("���� ������ ����");
				for(int i=0; i<drinkGa.length; i++) {
					System.out.println(drinkGa[i]);
				}
				break;
			case 99:
				System.out.println("���Ǳ� ����(���α׷� ����)");
				done = true;
				break;
			default:
				System.out.println("1,2,3,99�� �Է��ϼ���");
		
		    }
		
		}	
	
		
	}

}
