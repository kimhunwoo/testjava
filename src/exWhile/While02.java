/*
 *  do{
 *  
 *  }while(����);
 *  
 */
package exWhile;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		//�Է��� ������ ������ ���� �ݺ��ؾ��Ѵٸ� 
		int sel = 0;
		Scanner scan = new Scanner(System.in);
		boolean flag = true; // ������� ����.
		String temp = null;
		int count = 0; // �Է�Ƚ�� ���ϱ�
		
		
		do {
			System.out.println("Input Number : " + count + "ȸ - ");
			temp = scan.next(); // "52532" "1325f"
			count++;
			for(int i=0; i < temp.length(); i++) {
				if(temp.charAt(i)<'0' || temp.charAt(i)>'9') {
					System.out.println(temp.charAt(i));
					flag = false;  //�����ƴ��� ����ǥ����.
					break; // for���� ������Ŵ (�ڿ� ������ �ִ� �������.)
				}
				
				System.out.println("=====" + temp.charAt(i));
				// if ������ �ƴҰ�츦 ���� �ϸ� ����ȭ �� �� �ִ�.
				//������ ���� ���ش� (���α׷� �ۼ���)
				
				
//				if(temp.charAt(i)>='0' && temp.charAt(i)<='9') {
//					System.out.println(temp.charAt(i));
//				}else { // ������ �ƴ� ���
//					System.out.println(temp.charAt(i));
//					flag = false;  //�����ƴ��� ����ǥ����.
//					break; // for���� ������Ŵ (�ڿ� ������ �ִ� �������.)
//				}
			}
			
		}while(!flag);
		System.out.println("end" + temp);
	}

}







