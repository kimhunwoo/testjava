/* 메뉴 [ 두 수 입력 받아서 사칙연산 ]
 * 1. 합 2. 빼기 3. 곱 4. 나누기 99. 종료
 * 
 */
package exWhile;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean done = true; // 종료가 되면 false
		int sel = 0; // 메뉴선택자 - 변수, 항목, 필드, 아이템, 파라미터, 매개변수, 인자
		
		while(done) {
			// 메뉴보이기  -> 메소드로 

			sel = menuPrint();
			// 콘솔로 입력값보이기
			
			// 두수 입력을 받기
			
			if(sel == 1) {
				System.out.println("합");
				
				sum();
			}else if (sel == 2) {
				System.out.println("빼기");
				minus();
			}else if (sel == 3) {
				System.out.println("곱");
				multi();
			}else if (sel == 4) {
				System.out.println("나누기");
				div();
			}else if (sel == 99) {
				System.out.println("종료");
				done = false;
			}else {
				System.out.println("1, 2, 3, 4, 99만 입력해주세요");
			}
		}
		
	}

	private static void div() {
		// TODO Auto-generated method stub
		int num1 = 4;
		int num2 = 2;
		int div = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요");
		num1 = scan.nextInt();
		
		System.out.print("두번째 수를 입력하세요");
		num2 = scan.nextInt();
		
		div = num1 / num2;
		
		System.out.println("div : " + div);
	}

	private static void multi() {
		// TODO Auto-generated method stub
		int num1 = 3;
		int num2 = 3;
		int multi = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요");
		num1 = scan.nextInt();
		
		System.out.print("두번째 수를 입력하세요");
		num2 = scan.nextInt();
		
		multi = num1 * num2;
		
		System.out.println("multi :" + multi);
	}

	private static void minus() {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 3;
		int minus = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요");
		num1 = scan.nextInt();
		
		System.out.print("두번째 수를 입력하세요");
		num2 = scan.nextInt();	
		
		minus = num1 - num2;
		
		System.out.println("minus : " + minus);
	}

	private static void sum() {
		// TODO Auto-generated method stub
		int num1 = 1;
		int num2 = 2;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요");
		num1 = scan.nextInt();
		
		System.out.print("두번째 수를 입력하세요");
		num2 = scan.nextInt();
		
		sum = num1 + num2;
		
		System.out.println("sum : " + sum);
	}

	private static int menuPrint() {
		// TODO Auto-generated method stub
		System.out.println("=====메뉴 [사칙연산]======");
		System.out.println("1. 합");
		System.out.println("2. 빼기");
		System.out.println("3. 곱");
		System.out.println("4. 나누기");
		System.out.println("99. 종료");
		System.out.println("========================");
		System.out.print("Select Number : ");
		
		return menuPrint();
	}

}
