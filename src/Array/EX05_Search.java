package Array;

import java.util.Scanner;

public class EX05_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �˻� : ���� ã�ƶ� -> ��ġ(index)�� ��� �ִ�???
		int arr[] = {1,5,3,2,4,3,6,9,10,8};
		System.out.print("arr[]={ ");
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] + ",");  //����
		}
		System.out.println("}");
		
		int input, index = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ã�� ���� �Է�: ");
		input = scan.nextInt();
		
		for(int i=0; i< arr.length; i++) {
			if(arr[i] == input) {
				index = i;
//				break;
			}
		}
		
		System.out.println(input + "��" + (index+1) + "��° �ֽ��ϴ�.");
		
	}

}
