/*
 *  do{
 *  
 *  }while(조건);
 *  
 */
package exWhile;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		//입력이 정수를 받을때 까지 반복해야한다면 
		int sel = 0;
		Scanner scan = new Scanner(System.in);
		boolean flag = true; // 정수라고 가정.
		String temp = null;
		int count = 0; // 입력횟수 구하기
		
		
		do {
			System.out.println("Input Number : " + count + "회 - ");
			temp = scan.next(); // "52532" "1325f"
			count++;
			for(int i=0; i < temp.length(); i++) {
				if(temp.charAt(i)<'0' || temp.charAt(i)>'9') {
					System.out.println(temp.charAt(i));
					flag = false;  //정수아님을 상태표시함.
					break; // for문을 중지시킴 (뒤에 무엇이 있던 상관없음.)
				}
				
				System.out.println("=====" + temp.charAt(i));
				// if 문에서 아닐경우를 먼저 하면 간소화 될 수 있다.
				//조건을 먼저 봐준다 (프로그램 작성시)
				
				
//				if(temp.charAt(i)>='0' && temp.charAt(i)<='9') {
//					System.out.println(temp.charAt(i));
//				}else { // 정수가 아닌 경우
//					System.out.println(temp.charAt(i));
//					flag = false;  //정수아님을 상태표시함.
//					break; // for문을 중지시킴 (뒤에 무엇이 있던 상관없음.)
//				}
			}
			
		}while(!flag);
		System.out.println("end" + temp);
	}

}







