/* �̴�������Ʈ ����
 * 1. ���� on
 * 1-1. �޴� (ȭ�鼳��) 1. 1~10���� �� 2. �Է¹��� ������ �ܼ� ��� 99 . ����
 * 2. ���� 1 (ȭ�鼳��) : 1~10���� ��
 * 3. ���� 2 (ȭ�鼳��) : �Է¹��� ������ �ܼ� ���
 * 4. ���� �����ϰ�;�~~~~~-> off
 * 5. end
 * 
 * �޼ҵ� ����
 * ������ �޼ҵ��(�μ�1, �μ�2 ....) { �μ�1, �μ�2 => arg, �Ű�����
 * }
 * 
 * �帧 ��ƺ��� == ������
 * 
 */
package exWhile;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		//
		boolean done = false; // done�� fasle ��� ����. true ����
 		Scanner scan = new Scanner(System.in);
		int sel = 0; // �޴� ���� �Է� ����
		
		while(!done) {// ����ON
			//�޴� ���� 
			System.out.println("======= [Menu]========");
			System.out.println("1.  1~10������ ��");
			System.out.println("2. �Է¹��� ������ ������ ���");
			System.out.println("99. �����ϱ�");
			System.out.println("=============================");
			System.out.print("Select Number : ");
			sel = scan.nextInt();
			
			switch(sel) { // swith (���ǽ� �Ǵ� ��)
				case 1:
					System.out.println("��");
					int sum = 0;
					
					sum = sum(); // ���� ���ϴ� �޼ҵ�

					System.out.println("���� sum = " + sum);
					
					break;
				case 2:
					System.out.println("�ܼ����ϱ�");
					break;
				case 99:
					System.out.println("�޴�����");
					done = true;
					break;
				default:
					System.out.println("1,2,99�� �Է��ϼ���~~~���Է��ϼ���");
					
			}// end of switch
			
			
			
//			if(sel == 1) {
//				System.out.println("��");
//				
//			}else if(sel == 2) {
//				System.out.println("�ܼ� ���");
//				
//			}else if(sel == 99) {
//				System.out.println("�޴�����");
//				
//			}else {
//				System.out.println("1.2.99�� �Է��ϼ���!");
//			}
//			
			
		}// end of while(!done)
		
		System.out.println("Program End!!");
		
	} //end of main

	private static int sum() {
		// TODO Auto-generated method stub
		int sum = 0;

		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("sum = " + sum);
		System.out.println("================");
		return sum;
	} // end of sum

}
