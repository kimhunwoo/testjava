package Array;

import java.util.Arrays; // Arrays.toString()을 사용하기 위해 추가

public class EX_TEST {

	public static void main(String[] args) {
		// 배열의 선언과 생성을 동시에. 길이가 5인 int배열
		//int[] score = new int [5];
	//타입[] 변수이름 = new 타입[길이];
		
//		score[3] = 100;
//		int value = score[3];
//   ===========================
//		score[0] = 0;
//		score[1] = 10;
//		score[2] = 20;
//		score[3] = 30;
//		score[4] = 40;
//		
//		
//		for(int i = 0; i<5; i++) {
//			score[i] = i * 10;
//		System.out.println(score[i]);
//		}
//	====================================
//		int i = 2;
//		int tmp = score[i+1];
//		
//		score[3] = 100;
//		
//		System.out.println(score[i+1]);
//		================================
		
//		int[] score = new int[5];
//		int k = 1;
//		
//		score[0] = 50;
//		score[1] = 60;
//		score[k+1] = 70; // score[2] = 70;
//		score[3] = 80;
//		score[4] = 90;
//		
//		int tmp = score[k+2] + score[4]; // int tmp = score[3] + score[4];
//		
//		//for문으로 배열의 모든 요소를 출력한다.
//		for(int i=0; i<5; i++) {
//			System.out.println("score[" + i + "]" + " " + score[i]);
//		}
//		
//		System.out.printf("tmp:%d%n", tmp);
//	   System.out.printf("score[%d]:%d%n",7 , score[7]); //	index의 범위를 벗어난 값
//		=========================================================================

		//int[] arr = new int[0]; // 길이가 0인 배열도 생성이 가능하다!!!
		
//		int[] arr = new int[5]; // 길이가 5인 int배열
//		int tmp = arr.length; // arr.length의 값은 5이고 tmp에 5가 저장된다.
//		System.out.println(arr.length);
//		
//		arr.length = 10; // 에러. 배열의 길이는 변경할 수 없다.
//		================================================================
	
//		int[] score = new int[5]; // 배열의 길이를 6에서 5로 변경
		
//		for(int i =0; i<6; i++) { // 실수로 조건식을 변경하지 않음
//			System.out.println(score[i]); // 에러발생!!
//		}
//		
//		for(int i =0; i<score.length; i++) { // 조건식을 변경하지 않아도 됨
//			System.out.println(score[i]);
//		}
// 		=================================================================
		
//		int[] score = new int[5];  // 길이가 5인 int형 배열을 생성한다.
//		score[0] = 50;			   // 각 요소에 직접 값을 저장한다. 
//		score[1] = 60;
//		score[2] = 70;
//		score[3] = 80;
//		score[4] = 90;
//		 
//		for(int i = 0; i<score.length; i++) { // for문으로 배열을 초기화하려면, 일정한 규칙이 필요..
//			score[i] = i * 10 + 50;			
//		}
//		
//		int [] score = new int[] { 50, 60, 70, 80, 90}; // 배열의 생성과 초기화를 동시에
//		int [] score = { 50, 60, 70, 80, 90}; // new int[]를 생략할 수 있음.
//		
//		int[] score; // 배열의 선언과 생성을 따로 하는 경우에는 생략 할 수 없다.
//		score = new int [] {50, 60, 70, 80, 90}; // OK
//		score = { 50, 60, 70, 80, 90}; // 에러. new int[]를 생략할 수 없음

//		int add(int[] arr) {/* 내용 생략 */} // 매개변수로 int배열을 받는 add메서드가 정의되어 있고 이 메서드를 호출해야할 경우 'new 타입[]'을 생략할 수 없음
//		int result = add(new int[] { 100, 90, 80, 70, 60}); //ok
//		int result = add({100, 90, 80, 70, 60}); // 에러. new int[]를 생략할 수 없음.
		
//		int[] score = new int[0]; //길이가 0인 배열
//		int[] score = new int[] {}; //길이가 0인 배열
//		int[] score = {}; //길이가 0인 배열, new int[] 가 생략됨.
//==========================================================================================================================================
		
//		int[] iArr = {100, 95, 80, 70, 60};
		//배열의 요소를 순서대로 하나씩 출력
//		for(int i = 0; i<iArr.length; i++) {
//			//System.out.println(iArr[i]);
//			System.out.print(iArr[i] + ","); // 각 요소간의 구별을 위해 쉼표를 넣는다.
//		}
//		 System.out.println(); // 다음 출력이 바로 이어지지 않도록 줄 바꿈을 한다.

//		 System.out.println(Arrays.toString(iArr)); // 배열 iArr의 모든 요소를 출력한다. [100, 95, 80, 70, 60]이 출력된다.
		// ※ Arrays.toString()을 사용하려면, 'import java. util.*;'를 추가해야 한다.
		
//		System.out.println(iArr); // 배열을 가리키는 참조변수 iArr의 값을 출력한다. [I@7637f22 와 같은 형식의 문자열이 출력된다.
		
//		char[] chArr = { 'a', 'b', 'c', 'd'}; // println메서드가 char배열일 때만 이렇게 동작되도록 작성되어있다.
//		System.out.println(chArr); // abcd가 출력된다.
//		============================================================================================================
	
//		int[] iArr1 = new int [10];
//		int[] iArr2 = new int [6];
//        //int[] iArr3 = new int [] { 100, 95, 80, 70, 60};
//		int[] iArr3 = {100, 95, 80, 70, 60};
//		char[] chArr = {'a', 'b', 'c', 'd'};
//		
//		for(int i =0; i < iArr1.length; i++) {
//			iArr1[i] = i + 1; // 1~10의 숫자를 순서대로 배열에 넣는다.
//		}
//		
//		for(int i =0; i< iArr2.length; i++) {
//			iArr2[i] = (int)(Math.random()*45) + 1; //1~10의 값을 배열에 저장
//		}
//		
//		//배열에 저장된 값들을 출력한다.
//		for(int i = 0; i<iArr1.length; i++) {
//			System.out.print(iArr1[i] + ",");
//		}
//		System.out.println();
//		System.out.println(Arrays.toString(iArr2));
//		System.out.println(Arrays.toString(iArr3));
//		System.out.println(Arrays.toString(chArr));
//		System.out.println(iArr3);
//		System.out.println(chArr);
//		==========================================================================================
		
//		int[] arr = new int[5];
//		int[] tmp = new int [arr.length*2]; // 기존 배열보다 길이가 2배인 배열 생성
//		
//		for(int i =0; i<arr.length; i++) {
//			tmp[i] = arr[i]; // arr[i]의 값을 tmp[i]에 저장
//		}
//		
//		arr = tmp; // 참조변수 arr이 새로운 배열을 가리키게 한다, 변수 tmp에 저장된 값을 변수 arr에 저장한다.
// ===================================================================================================
		
//		int[] arr = new int[5];
//		
//		// 배열 arr에 1~5를 저장한다.
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = i + 1 ;
//		}
//		System.out.println("[변경전]");
//		System.out.println("arr.length : " + arr.length);
//		for(int i = 0; i<arr.length; i++) {
//			System.out.println("arr["+ i +"]:" + arr[i]);
//		}
//		
//		int[] tmp = new int [arr.length*2];
//		
//		// 배열 arr에 저장된 값들을 배열 tmp에 복사한다.
//		for(int i = 0; i<arr.length; i++) {
//			tmp[i] = arr[i];
//		}
//	
//		arr = tmp; // tmp에 저장된 값을 arr에 저장한다.
//		
//		System.out.println("[변경후]");
//		System.out.println("arr.length : " + arr.length);
//		for(int i = 0; i<arr.length; i++) {
//			System.out.println("arr[" + i + "]" + arr[i]);
//		}
//	==============================================================	
//		String[] name = new String[3]; // 3개의 문자열을 담을 수 있는 배열을 생성한다.
//		name[0] = "Kim";
//		name[1] = "Park";
//		name[2] = "Yi";
//		String[] name = new String[] {"Kim", "Park", "Yi"};
//		String[] name = {"Kim", "Park", "Yi"}; // new String[]을 생략할 수 있음
//  ===========================================================================
//		int a = 5;
//		int b = 2;
//		float div = 0f;
//		
//		div = a/(float)b;
//		System.out.println(div);
		
//		int sum = 0;          // 총점을 저장하기 위한 변수
//		float average = 0f;   // 평균을 저장하기 위한 변수
//		
//		int[] score = {100, 88, 100, 100, 90};
//		
//		for(int i = 0; i<score.length; i++) {
//			sum += score[i];  // 반복문을 이용해서 배열에 저장되어 있는 값들을 모두 더한다.
//		}
//		average = sum / (float)score.length; // 계산결과를 float로 얻기 위해서 형변환
//		
//		System.out.println("총점 : " + sum);
//		System.out.println("평균 : " + average);
//     ========================================================================
//		int[] score = {79, 88, 91, 33, 100, 55, 95};
//
//		int max = score[0]; // 배열의 첫 번째 값으로 최대값을 초기화 한다.
//		int min = score[0]; // 배열의 첫 번째 값으로 최소값을 초기화 한다.
//		
//		for(int i = 1; i<score.length; i++) { // 배열의 두 번째 요소부터 읽기 위해서 변수 i의 값을 1로 초기화 했다.
//			if(score[i]>max) {
//				max = score[i];
//				System.out.println(i + "번째 최대값 : " + max);
//				System.out.println();
//			}else if(score[i]<min) {
//				min = score[i];
//				System.out.println(i + "번째 최소값 : " + min);
//				System.out.println();
//			} 
//		} // end of for
		
//		System.out.println("최대값 : " + max);
//		System.out.println("최소값 : " + min);
//		===========================================================================
//		int[] numArr = new int [10];
//		
//		for(int i = 0; i<numArr.length; i++) {
//			numArr[i] = i; // 배열을 0~9의 숫자로 초기화한다.
//			System.out.print(numArr[i] + ",");
//		}
//		System.out.println();
//		System.out.println();
//		
//		for(int i = 0; i<100; i++) {
//			int n= (int)(Math.random() * 10); // 0~9중의 한 값을 임의로 얻는다.
//			int tmp = numArr[0];
//			numArr[0]=numArr[n]; // numArr[0]과 numArr[n]의 값을 서로 바꾼다.
//			numArr[n]=tmp;
//		}
//		
//		for(int i=0; i<numArr.length; i++) {
//		System.out.print(numArr[i] + ",");
//		}
//	==========================================================================	
		
		
	} // end of main

} // end of class
