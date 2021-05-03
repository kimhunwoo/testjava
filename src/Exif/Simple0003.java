/*
 * 나이를 키보드로 입력받아서
 * 60세이상이면 "노인"
 * 60세미만 40세이상이면 "중년"
 * 40세미만이면 "청소년"를 출력하는 프로그래밍하기.
 * 
 * "당신의 나이는 00이고 000입니다."
 */
package Exif;

import java.util.Scanner;

public class Simple0003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//선언
        Scanner scan = new Scanner(System.in);
        int num1 = 0;
        String str = ""; 
        
        //입력
        System.out.print("나이를 입력해주세요");
        num1 = Integer.parseInt(scan.next());
        
        //처리
        if(num1>=60) { //60이상
        	str = "노인";
        }else if(num1>=40) { //60세미만 40세 이상
        	str = "중년";
        }else { // 40세미만
        	str = "청소년";       
        }
        
        System.out.println("당신의 나이는 " + num1 + "이고 " + str + "입니다.");
        
        
	}

}
