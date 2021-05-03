package Array;

import java.util.Scanner;

public class EX05_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 검색 : 값을 찾아라 -> 위치(index)가 어디에 있니???
		int arr[] = {1,5,3,2,4,3,6,9,10,8};
		System.out.print("arr[]={ ");
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] + ",");  //수정
		}
		System.out.println("}");
		
		int input, index = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("찾을 숫자 입력: ");
		input = scan.nextInt();
		
		for(int i=0; i< arr.length; i++) {
			if(arr[i] == input) {
				index = i;
//				break;
			}
		}
		
		System.out.println(input + "는" + (index+1) + "번째 있습니다.");
		
	}

}
