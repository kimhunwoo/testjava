/*
 *  랜덤으로 숫자(1~45)를 발생시켜서 6개의 로또번호를 입력하기
 *  int[] lotto;
 */
package Array;

public class EX08_Lotto {

	public static void main(String[] args) {
		// lotto[] 배열명[idx] == 값
		
		// 선언
		int[] lotto = new int[6];
		
		// 배열에 랜던값 입력
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45) + 1;
		}
//		lotto[1] = (int)(Math.random()*45) + 1;
//		lotto[2] = (int)(Math.random()*45) + 1;
//		lotto[3] = (int)(Math.random()*45) + 1;
//		lotto[4] = (int)(Math.random()*45) + 1;
//		lotto[5] = (int)(Math.random()*45) + 1;

		// 배열 출력
		for(int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
			
		}
	}

}
