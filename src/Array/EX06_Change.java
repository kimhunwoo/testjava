package Array;

public class EX06_Change {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 33;
		arr[1] = 24;
		arr[2] = 55;
		arr[3] = 82;
		arr[4] = 11;
		
		// 배열의 값 출력하기
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		// 요소번호(idx) 2,3번의 값을 변경 : 임시 변수 필요
		// arr[2] <=> arr[3]
		int temp = arr[2];
		arr[2] = arr[3];
		arr[3] = temp;
		
		System.out.println("=====================");
		
		// 배열의 값 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("=====================");

		// 배열의 값을 역순으로 출력 : 시작값변경, 조건 변경, 감소치
		for(int i=4; -1<i && i<arr.length; i--) {
		
			System.out.println(arr[i]);
			
		}
		
	}
		
}


