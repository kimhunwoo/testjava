/* 다중 if문
 * => 경우의 수가 3가지
 * if() {
 * }else if() {
 * } else{
 * }
 * 키보드로 점수를 입력받아서 90이상이면 A, 80 이상이면 B, 70 이상이면 C, 60 이상이면 D, 60미만이면 F
 * 
 *  선언 : 점수 - int score, 키보드 -> Scanner
 *  A-F -> char grade
 */
package Exif;

import java.util.Scanner;

public class Simple0002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 선언
		Scanner scan = new Scanner(System.in);
		int score = 0; //점수
		char grade = 'x'; //  성적    string grade;
		//입력
		System.out.println("점수를 입력하세요 : ");
		score = scan.nextInt();
		
		//처리
	    if(score>=90) {
	    	grade = 'A';
	    }else if(score>=80) {
	    	grade = 'B';
	    }else if(score>=70) {
	    	grade = 'C';
	    }else if(score>=60) {
	    	grade = 'D';
	    }else {
	    	grade = 'F';
	    }
		//출력 "당신의 점수는 00이고 성적은 0입니다."
	    System.out.println("당신의 점수는 " + score + " 이고 성적은 " + grade + " 입니다.");
	    
		
	    
	}

}
