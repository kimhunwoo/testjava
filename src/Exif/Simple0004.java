/*
 * 두수비교
 */
package Exif;

import java.util.Scanner;

public class Simple0004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 두 정수 A와 B가 주어졌을때 , A와 B를 비교하는 프로그램을 작성하시오.
		// 첫째 줄 A와 B가 주어진다. 
		
		/*
		 * 첫째 줄에 다음 세 가지 중 하나를 출력한다.
		 * A가 B보다 큰 경우에는 '>'를 출력한다.
		 * A가 B보다 작은 경우에는 '<'를 출력한다.
		 * A와 B가 같은 경우에는 '=='를 출력한다.
		 * 
		 */
        //선언
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		//입력

		int A=1; // int num1 = 0;
		int B=0; // int num2 = 0;
		String str = "o";
		//처리
		if(A==B) {
			str = "==";
		}else if(A>B) {
			str = ">";
		}else {
			str = "<";
		}
	 System.out.println(str);
		
	}

}
