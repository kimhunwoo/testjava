package Array;

import java.util.Arrays; // Arrays.toString()�� ����ϱ� ���� �߰�

public class EX_TEST {

	public static void main(String[] args) {
		// �迭�� ����� ������ ���ÿ�. ���̰� 5�� int�迭
		//int[] score = new int [5];
	//Ÿ��[] �����̸� = new Ÿ��[����];
		
//		score[3] = 100;
//		int value = score[3];
//   ===========================
//		score[0] = 0;
//		score[1] = 10;
//		score[2] = 20;
//		score[3] = 30;
//		score[4] = 40;
//		
//		
//		for(int i = 0; i<5; i++) {
//			score[i] = i * 10;
//		System.out.println(score[i]);
//		}
//	====================================
//		int i = 2;
//		int tmp = score[i+1];
//		
//		score[3] = 100;
//		
//		System.out.println(score[i+1]);
//		================================
		
//		int[] score = new int[5];
//		int k = 1;
//		
//		score[0] = 50;
//		score[1] = 60;
//		score[k+1] = 70; // score[2] = 70;
//		score[3] = 80;
//		score[4] = 90;
//		
//		int tmp = score[k+2] + score[4]; // int tmp = score[3] + score[4];
//		
//		//for������ �迭�� ��� ��Ҹ� ����Ѵ�.
//		for(int i=0; i<5; i++) {
//			System.out.println("score[" + i + "]" + " " + score[i]);
//		}
//		
//		System.out.printf("tmp:%d%n", tmp);
//	   System.out.printf("score[%d]:%d%n",7 , score[7]); //	index�� ������ ��� ��
//		=========================================================================

		//int[] arr = new int[0]; // ���̰� 0�� �迭�� ������ �����ϴ�!!!
		
//		int[] arr = new int[5]; // ���̰� 5�� int�迭
//		int tmp = arr.length; // arr.length�� ���� 5�̰� tmp�� 5�� ����ȴ�.
//		System.out.println(arr.length);
//		
//		arr.length = 10; // ����. �迭�� ���̴� ������ �� ����.
//		================================================================
	
//		int[] score = new int[5]; // �迭�� ���̸� 6���� 5�� ����
		
//		for(int i =0; i<6; i++) { // �Ǽ��� ���ǽ��� �������� ����
//			System.out.println(score[i]); // �����߻�!!
//		}
//		
//		for(int i =0; i<score.length; i++) { // ���ǽ��� �������� �ʾƵ� ��
//			System.out.println(score[i]);
//		}
// 		=================================================================
		
//		int[] score = new int[5];  // ���̰� 5�� int�� �迭�� �����Ѵ�.
//		score[0] = 50;			   // �� ��ҿ� ���� ���� �����Ѵ�. 
//		score[1] = 60;
//		score[2] = 70;
//		score[3] = 80;
//		score[4] = 90;
//		 
//		for(int i = 0; i<score.length; i++) { // for������ �迭�� �ʱ�ȭ�Ϸ���, ������ ��Ģ�� �ʿ�..
//			score[i] = i * 10 + 50;			
//		}
//		
//		int [] score = new int[] { 50, 60, 70, 80, 90}; // �迭�� ������ �ʱ�ȭ�� ���ÿ�
//		int [] score = { 50, 60, 70, 80, 90}; // new int[]�� ������ �� ����.
//		
//		int[] score; // �迭�� ����� ������ ���� �ϴ� ��쿡�� ���� �� �� ����.
//		score = new int [] {50, 60, 70, 80, 90}; // OK
//		score = { 50, 60, 70, 80, 90}; // ����. new int[]�� ������ �� ����

//		int add(int[] arr) {/* ���� ���� */} // �Ű������� int�迭�� �޴� add�޼��尡 ���ǵǾ� �ְ� �� �޼��带 ȣ���ؾ��� ��� 'new Ÿ��[]'�� ������ �� ����
//		int result = add(new int[] { 100, 90, 80, 70, 60}); //ok
//		int result = add({100, 90, 80, 70, 60}); // ����. new int[]�� ������ �� ����.
		
//		int[] score = new int[0]; //���̰� 0�� �迭
//		int[] score = new int[] {}; //���̰� 0�� �迭
//		int[] score = {}; //���̰� 0�� �迭, new int[] �� ������.
//==========================================================================================================================================
		
//		int[] iArr = {100, 95, 80, 70, 60};
		//�迭�� ��Ҹ� ������� �ϳ��� ���
//		for(int i = 0; i<iArr.length; i++) {
//			//System.out.println(iArr[i]);
//			System.out.print(iArr[i] + ","); // �� ��Ұ��� ������ ���� ��ǥ�� �ִ´�.
//		}
//		 System.out.println(); // ���� ����� �ٷ� �̾����� �ʵ��� �� �ٲ��� �Ѵ�.

//		 System.out.println(Arrays.toString(iArr)); // �迭 iArr�� ��� ��Ҹ� ����Ѵ�. [100, 95, 80, 70, 60]�� ��µȴ�.
		// �� Arrays.toString()�� ����Ϸ���, 'import java. util.*;'�� �߰��ؾ� �Ѵ�.
		
//		System.out.println(iArr); // �迭�� ����Ű�� �������� iArr�� ���� ����Ѵ�. [I@7637f22 �� ���� ������ ���ڿ��� ��µȴ�.
		
//		char[] chArr = { 'a', 'b', 'c', 'd'}; // println�޼��尡 char�迭�� ���� �̷��� ���۵ǵ��� �ۼ��Ǿ��ִ�.
//		System.out.println(chArr); // abcd�� ��µȴ�.
//		============================================================================================================
	
//		int[] iArr1 = new int [10];
//		int[] iArr2 = new int [6];
//        //int[] iArr3 = new int [] { 100, 95, 80, 70, 60};
//		int[] iArr3 = {100, 95, 80, 70, 60};
//		char[] chArr = {'a', 'b', 'c', 'd'};
//		
//		for(int i =0; i < iArr1.length; i++) {
//			iArr1[i] = i + 1; // 1~10�� ���ڸ� ������� �迭�� �ִ´�.
//		}
//		
//		for(int i =0; i< iArr2.length; i++) {
//			iArr2[i] = (int)(Math.random()*45) + 1; //1~10�� ���� �迭�� ����
//		}
//		
//		//�迭�� ����� ������ ����Ѵ�.
//		for(int i = 0; i<iArr1.length; i++) {
//			System.out.print(iArr1[i] + ",");
//		}
//		System.out.println();
//		System.out.println(Arrays.toString(iArr2));
//		System.out.println(Arrays.toString(iArr3));
//		System.out.println(Arrays.toString(chArr));
//		System.out.println(iArr3);
//		System.out.println(chArr);
//		==========================================================================================
		
//		int[] arr = new int[5];
//		int[] tmp = new int [arr.length*2]; // ���� �迭���� ���̰� 2���� �迭 ����
//		
//		for(int i =0; i<arr.length; i++) {
//			tmp[i] = arr[i]; // arr[i]�� ���� tmp[i]�� ����
//		}
//		
//		arr = tmp; // �������� arr�� ���ο� �迭�� ����Ű�� �Ѵ�, ���� tmp�� ����� ���� ���� arr�� �����Ѵ�.
// ===================================================================================================
		
//		int[] arr = new int[5];
//		
//		// �迭 arr�� 1~5�� �����Ѵ�.
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = i + 1 ;
//		}
//		System.out.println("[������]");
//		System.out.println("arr.length : " + arr.length);
//		for(int i = 0; i<arr.length; i++) {
//			System.out.println("arr["+ i +"]:" + arr[i]);
//		}
//		
//		int[] tmp = new int [arr.length*2];
//		
//		// �迭 arr�� ����� ������ �迭 tmp�� �����Ѵ�.
//		for(int i = 0; i<arr.length; i++) {
//			tmp[i] = arr[i];
//		}
//	
//		arr = tmp; // tmp�� ����� ���� arr�� �����Ѵ�.
//		
//		System.out.println("[������]");
//		System.out.println("arr.length : " + arr.length);
//		for(int i = 0; i<arr.length; i++) {
//			System.out.println("arr[" + i + "]" + arr[i]);
//		}
//	==============================================================	
//		String[] name = new String[3]; // 3���� ���ڿ��� ���� �� �ִ� �迭�� �����Ѵ�.
//		name[0] = "Kim";
//		name[1] = "Park";
//		name[2] = "Yi";
//		String[] name = new String[] {"Kim", "Park", "Yi"};
//		String[] name = {"Kim", "Park", "Yi"}; // new String[]�� ������ �� ����
//  ===========================================================================
//		int a = 5;
//		int b = 2;
//		float div = 0f;
//		
//		div = a/(float)b;
//		System.out.println(div);
		
//		int sum = 0;          // ������ �����ϱ� ���� ����
//		float average = 0f;   // ����� �����ϱ� ���� ����
//		
//		int[] score = {100, 88, 100, 100, 90};
//		
//		for(int i = 0; i<score.length; i++) {
//			sum += score[i];  // �ݺ����� �̿��ؼ� �迭�� ����Ǿ� �ִ� ������ ��� ���Ѵ�.
//		}
//		average = sum / (float)score.length; // ������� float�� ��� ���ؼ� ����ȯ
//		
//		System.out.println("���� : " + sum);
//		System.out.println("��� : " + average);
//     ========================================================================
//		int[] score = {79, 88, 91, 33, 100, 55, 95};
//
//		int max = score[0]; // �迭�� ù ��° ������ �ִ밪�� �ʱ�ȭ �Ѵ�.
//		int min = score[0]; // �迭�� ù ��° ������ �ּҰ��� �ʱ�ȭ �Ѵ�.
//		
//		for(int i = 1; i<score.length; i++) { // �迭�� �� ��° ��Һ��� �б� ���ؼ� ���� i�� ���� 1�� �ʱ�ȭ �ߴ�.
//			if(score[i]>max) {
//				max = score[i];
//				System.out.println(i + "��° �ִ밪 : " + max);
//				System.out.println();
//			}else if(score[i]<min) {
//				min = score[i];
//				System.out.println(i + "��° �ּҰ� : " + min);
//				System.out.println();
//			} 
//		} // end of for
		
//		System.out.println("�ִ밪 : " + max);
//		System.out.println("�ּҰ� : " + min);
//		===========================================================================
//		int[] numArr = new int [10];
//		
//		for(int i = 0; i<numArr.length; i++) {
//			numArr[i] = i; // �迭�� 0~9�� ���ڷ� �ʱ�ȭ�Ѵ�.
//			System.out.print(numArr[i] + ",");
//		}
//		System.out.println();
//		System.out.println();
//		
//		for(int i = 0; i<100; i++) {
//			int n= (int)(Math.random() * 10); // 0~9���� �� ���� ���Ƿ� ��´�.
//			int tmp = numArr[0];
//			numArr[0]=numArr[n]; // numArr[0]�� numArr[n]�� ���� ���� �ٲ۴�.
//			numArr[n]=tmp;
//		}
//		
//		for(int i=0; i<numArr.length; i++) {
//		System.out.print(numArr[i] + ",");
//		}
//	==========================================================================	
		
		
	} // end of main

} // end of class
