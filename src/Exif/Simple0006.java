/* A         -> A+,    Ao,   A-
 *90~100      97�̻�,      93���� 
 */
package Exif;

import java.util.Scanner;

public class Simple0006 {

	public static void main(String[] args) {
		 // ����
		Scanner scan = new Scanner(System.in);
		int score = 0; //����
		char grade = 'x'; //  ����    string grade;
		char buho = 'o';
		//�Է�
		System.out.println("������ �Է��ϼ��� : ");
		score = scan.nextInt();
		
		//ó��
	    if(score>=90 && score <=100) {  //90~100������ �� 90<= score, score <= 100
	    	grade = 'A';
	    	if(score>=97) { // buho '+'
	    		buho = '+';
	    	}else if(score<=93) { // buho '-'
	    		buho = '-';
	    	}else { // buho 'o'
	    		buho = 'o';
	    	}
	    	
	    }else if(score>=80) {
	    	grade = 'B';
	    	if(score>=87) { // buho '+'
	    		buho = '+';
	    	}else if(score<=83) { // buho '-'
	    		buho = '-';
	    	}else { // buho 'o'
	    		buho = 'o';
	    	}
	    }else if(score>=70) {
	    	grade = 'C';
	    	if(score>=77) { // buho '+'
	    		buho = '+';
	    	}else if(score<=73) { // buho '-'
	    		buho = '-';
	    	}else { // buho 'o'
	    		buho = 'o';
	    	}
	    }else if(score>=60) {
	    	grade = 'D';
	    	if(score>=67) { // buho '+'
	    		buho = '+';
	    	}else if(score<=63) { // buho '-'
	    		buho = '-';
	    	}else { // buho 'o'
	    		buho = 'o';
	    	}
	    }else {
	    	grade = 'F';
	    }
		//��� "����� ������ 00�̰� ������ 0�Դϴ�."
	    System.out.println("����� ������ " + score + " �̰� ������ " + grade + buho + " �Դϴ�.");
	    
		
	    
	}

}

