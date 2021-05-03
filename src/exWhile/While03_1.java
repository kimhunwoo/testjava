package exWhile;

import java.util.Scanner;

public class While03_1 {

	static Scanner scan = new Scanner(System.in);  // 전역변수(타입)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean done = true; // 종료가 되면 false
		int sel = 0; // 메뉴선택자 - 변수, 항목, 필드, 아이템, 파라미터, 매개변수, 인자
		int num1 = 0, num2 = 0; // 두 수
		while(done) {
			// 메뉴보이기  -> 메소드로 	// 콘솔로 입력값보이기

			sel = menuPrint();
			
			// 두수 입력을 받기
			if(sel >= 1 && sel <= 4) { // 1, 2, 3, 4일때 두수 입력을 받기.
				System.out.println("First Number : ");
				num1 = scan.nextInt();
				System.out.println("Second Number : ");
				num2 = scan.nextInt();
			}
			
			switch(sel) {
			// case 3, 4, 5:
			
			case 1: // 합을 구하는 메소드 -> 데이터 추가
				int sum = sum(num1, num2);
				System.out.println(sum);
//			  	sum();
				break;
			case 2: // 빼기 -> 데이터 수정
				int minus = minus(num1, num2);
				System.out.println(minus);	
				break;
			case 3: // 곱셈 -> 데이터 조회
				int mul= mul(num1, num2);
				System.out.println(mul);
				break;
			case 4: //나눗셈 -> 데이터 삭제
				int div= div(num1, num2);
				System.out.println(div);
				break;
			case 99: //종료
				done = false;
				break;
			  
			default : // 재입력
				System.out.println("1, 2, 3, 4, 99를 입력해주세요~");
				break;
		  } //end of swich (입력)

		} // end of while (done)
		System.out.println("Program Out!");
		
	} // end of main()

	private static int div(int num1, int num2) {
		// TODO Auto-generated method stub
		int div = num1 / num2;
		
		return div;
	}

	private static int mul(int num1, int num2) {
		// TODO Auto-generated method stub
		int mul = num1 * num2;
		
		return mul;
	}

	private static int minus(int num1, int num2) {
		// TODO Auto-generated method stub
		int minus = num1 - num2;
		
		return minus;
	}

	private static void sum() {
		// TODO Auto-generated method stub
		// 두 수를 입력받아서 합을 계산하는 메소드 
	}

	private static int sum(int num1, int num2) { // call by value
		int sum = num1 + num2;
//		System.out.println("합 : " + sum);
		return sum; // sum
	}

// 두 수를 넘겨받아서 합을 리턴함.	
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
		
		return scan.nextInt();
	}


}