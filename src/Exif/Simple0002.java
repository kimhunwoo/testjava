/* ���� if��
 * => ����� ���� 3����
 * if() {
 * }else if() {
 * } else{
 * }
 * Ű����� ������ �Է¹޾Ƽ� 90�̻��̸� A, 80 �̻��̸� B, 70 �̻��̸� C, 60 �̻��̸� D, 60�̸��̸� F
 * 
 *  ���� : ���� - int score, Ű���� -> Scanner
 *  A-F -> char grade
 */
package Exif;

import java.util.Scanner;

public class Simple0002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ����
		Scanner scan = new Scanner(System.in);
		int score = 0; //����
		char grade = 'x'; //  ����    string grade;
		//�Է�
		System.out.println("������ �Է��ϼ��� : ");
		score = scan.nextInt();
		
		//ó��
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
		//��� "����� ������ 00�̰� ������ 0�Դϴ�."
	    System.out.println("����� ������ " + score + " �̰� ������ " + grade + " �Դϴ�.");
	    
		
	    
	}

}
