/*
 * 100열짜리 1차원 배열을 선언하고
 * for문을 이용하여 1~100까지 100개의 값을 입력하고
 * 입력된 100개의 값의 중 4의 배수들의 합과 4의 배수는 몇개인지 구하기.
 */
package Array;

import java.util.Scanner;

public class EX04_Array_1Tol100Sum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("배열의 개수 입력 : ");
		int N = scan.nextInt();
		
		int[] num = new int [N]; // 배열 선언 및 생성
		int sum4 = 0; // 4의 배수의 합
		int count = 0; // 4의 배수 카운터
		
		// 입력
		for(int i=0; i<num.length; i++) {
			num[i] = i + 1;
		}
		// 처리
		for(int i=0; i<num.length; i++) {
			if(num[i] % 4 == 0) { // 4의 배수이면
				sum4 = sum4 + num[i]; //  합
				count++; // 개수 증가
			
			}
		}
		//출력
		System.out.println("4의 배수의 합 : " + sum4);
		System.out.println("4의 배수의 개수 : " + count);
		}	
}
	