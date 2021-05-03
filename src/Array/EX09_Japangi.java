/*
 *  음료의 종류 : 사이다, 콜라, 커피
 *  음료의 가격 : 500, 500, 1000
 *  남은 음료 : 5, 8, 7
 *  1차원 배열로 작성 : drinkName[3], drinkPrice[3], drinkGa[3]
 *  
 *  [메뉴]
 *  1. 동전투입
 *  2. 음료수 선택 => 1. 콜라 2. 사이다 3. 커피 
 *  3. 음료 남은 개수
 *  99. 자판기 종료 (프로그램 종료)
 *  -----------------------------
 *  
 */
package Array;

import java.util.Scanner;

public class EX09_Japangi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String[] drinkName = {"콜라","사이다","커피"}; //음료수명
		int[] drinkPrice = {500, 500, 1000}; //음료가격
		int[] drinkGa = {5,8,7}; //음료의 남은 개수

		//처리
		boolean done = false; // 자판기 중지여부
		int menu = 0; //메뉴 선택키
		int selDrink = 0; //음료 선택키
		
		int money = 0, total = 0; //투입된 돈, 금액 누적
		
		while(!done) {
		
			//메뉴 설계
			System.out.println("[메뉴]");
			System.out.println("1. 동전투입");
			System.out.println("2. 음료수 선택 => 1. 콜라 2. 사이다 3. 커피");
			System.out.println("3. 음료 남은 개수");
			System.out.println("99. 자판기 종료(프로그램 종료)");
			System.out.println("---------------------------------------");
			
			menu = scan.nextInt();
			System.out.print("1만원 이하의 금액을 투입하세요 :");
			money = scan.nextInt();
//			selDrink = scan.nextInt();
//			total = scan.nextInt();
			
			switch(menu) { 
			case 1:
				if(money <=10000) {
					System.out.print(money + "의 금액이 투입되었습니다.");
				}else 
					System.out.println("금액을 다시 투입해주세요.");
				break;
			case 2:
				System.out.println("음료수 선택 => 1. 콜라 2. 사이다 3. 커피");
				for(int i = 0; i<drinkName.length; i++) {
					if(drinkName.length == 1) {
						System.out.println(drinkName[0]);
					}else if (drinkName.length == 2 ) {
						System.out.println(drinkName[1]);
					}else
						System.out.println(drinkName[2]);
						drinkName[i] = scan.next();
				}
				break;
			case 3:
				System.out.println("남은 음료의 갯수");
				for(int i=0; i<drinkGa.length; i++) {
					System.out.println(drinkGa[i]);
				}
				break;
			case 99:
				System.out.println("자판기 종료(프로그램 종료)");
				done = true;
				break;
			default:
				System.out.println("1,2,3,99를 입력하세요");
		
		    }
		
		}	
	
		
	}

}
