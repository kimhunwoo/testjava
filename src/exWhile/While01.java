/* 미니프로젝트 설계
 * 1. 전원 on
 * 1-1. 메뉴 (화면설계) 1. 1~10부터 합 2. 입력받은 정수로 단수 출력 99 . 종료
 * 2. 수행 1 (화면설계) : 1~10부터 합
 * 3. 수행 2 (화면설계) : 입력받은 정수로 단수 출력
 * 4. 전원 오프하고싶어~~~~~-> off
 * 5. end
 * 
 * 메소드 정의
 * 리턴형 메소드명(인수1, 인수2 ....) { 인수1, 인수2 => arg, 매개변수
 * }
 * 
 * 흐름 잡아보기 == 순서도
 * 
 */
package exWhile;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		//
		boolean done = false; // done이 fasle 라면 시작. true 중지
 		Scanner scan = new Scanner(System.in);
		int sel = 0; // 메뉴 선택 입력 변수
		
		while(!done) {// 전원ON
			//메뉴 설계 
			System.out.println("======= [Menu]========");
			System.out.println("1.  1~10까지의 합");
			System.out.println("2. 입력받은 정수의 구구단 출력");
			System.out.println("99. 종료하기");
			System.out.println("=============================");
			System.out.print("Select Number : ");
			sel = scan.nextInt();
			
			switch(sel) { // swith (조건식 또는 값)
				case 1:
					System.out.println("합");
					int sum = 0;
					
					sum = sum(); // 합을 구하는 메소드

					System.out.println("최종 sum = " + sum);
					
					break;
				case 2:
					System.out.println("단수구하기");
					break;
				case 99:
					System.out.println("메뉴종료");
					done = true;
					break;
				default:
					System.out.println("1,2,99를 입력하세요~~~재입력하세요");
					
			}// end of switch
			
			
			
//			if(sel == 1) {
//				System.out.println("합");
//				
//			}else if(sel == 2) {
//				System.out.println("단수 출력");
//				
//			}else if(sel == 99) {
//				System.out.println("메뉴종료");
//				
//			}else {
//				System.out.println("1.2.99만 입력하세요!");
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
