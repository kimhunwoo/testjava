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
 */
package Check;

import java.util.Scanner;

public class Check01 {

	public static void main(String[] args) {
		//
		boolean done = false;		
		Scanner scan = new Scanner(System.in);
		int sel = 0;
		
		while(!done) {
			System.out.println("========[Menu]=========");
			System.out.println("1. 1~10������ ��");
			System.out.println("2. �Է¹��� ������ ������ ���");
			System.out.println("99. �����ϱ�");
			System.out.println("=======================");
			System.out.print("Select Number : ");
			sel = scan.nextInt();
			
			switch (sel) {
				case 1:
					System.out.println("��");
				int sum = 0;
				
				sum = sum();
				
					System.out.println("���� sum " + sum);
					break;
				case 2:
					System.out.println("�ܼ� ���ϱ�");
					break;
				case 99:
					System.out.println("�޴�����");
					done = true;
					break;
				default :
					System.out.println("1,2,99�� �Է��ϼ���~~~~ ���Է��ϼ���");

				
			}
		
		}

	}
	private static int sum() {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i;
				
		}
		System.out.println("sum = " + sum);
		System.out.println("==============");
		return sum;
	}
}

