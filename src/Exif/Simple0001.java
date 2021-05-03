/*
 *  키보드로 정수를 입력받아서 짝수인지 홀수인지 출력
 */
package Exif;

import java.util.Scanner;

public class Simple0001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 선언
		Scanner scan = new Scanner(System.in);
        int num1 = 0;
        //입력
        System.out.print("숫자를 입력하세요 :");
        num1 = scan.nextInt();
        // 처리 num1 % 2 => 나머지값이 1이면 홀수
//        if(조건문)
        if(num1 % 2 == 1) {
        	System.out.println("홀수");
        }else {
        	System.out.println("짝수");
        }
        System.out.println("Program End!");
        
        
	}

}
