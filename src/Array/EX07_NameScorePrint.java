package Array;

import java.util.Scanner;

public class EX07_NameScorePrint {

	public static void main(String[] args) {
		// �л��� �Է��� �޾Ƽ� �л��� �̸��� ������ �Է�����
		// N               �迭��:  name , score
		//�л����Է¹ޱ�
		Scanner scan = new Scanner(System.in);

		System.out.print("�л����� ���>");
		int N = scan.nextInt();
		
		// �̸��� ���� ���� �� ����
		String names[] = new String[N];
		int scores[] = new int[N];
		// �л��� �̸� �Է�		
		for (int i = 0; i < scores.length; i++) {
			System.out.print(i + "�� �л��� �̸��Է�>");
			 names[i] = scan.next();
			 
		}
		System.out.println("�л�������");// �л��̸����
		for (int i = 0; i < names.length; i++) {
			System.out.println(i+" �� : "+names[i]);
		}
		// �л��� ���� �Է�
		System.out.println("�л� ���� �Է�");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(names[i]+"�� ����>");
			int score = scan.nextInt();
			scores[i] = score;
		}
		
		System.out.println("��� �� ���� ���");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]+" : "+scores[i]+" ��");
		}		
		
		

	}

}
