package Exfor;

import java.util.Scanner;

public class ForDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드로 단수를 입력받아 1~9까지 곱을 구하세요
		
		//선언
		Scanner scan = new Scanner(System.in);
		int dan = 0, result = 0;
		
		
		//입력
		System.out.print("단수를 입력하세요.");
		dan = Integer.parseInt(scan.next());
		
		

		//처리 또는 출력
		
		System.out.println(dan + "단 출력");
		for(int i=1; i<=9; i++) {
			//처리전 동작
			result = dan * i; //처리
			System.out.println(dan + " * "+ i + " = " + result);
			//처리후 동작
		}
	}  // end of main(String[] args)
} // end of Class
