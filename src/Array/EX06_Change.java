package Array;

public class EX06_Change {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 33;
		arr[1] = 24;
		arr[2] = 55;
		arr[3] = 82;
		arr[4] = 11;
		
		// �迭�� �� ����ϱ�
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		// ��ҹ�ȣ(idx) 2,3���� ���� ���� : �ӽ� ���� �ʿ�
		// arr[2] <=> arr[3]
		int temp = arr[2];
		arr[2] = arr[3];
		arr[3] = temp;
		
		System.out.println("=====================");
		
		// �迭�� �� ���
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("=====================");

		// �迭�� ���� �������� ��� : ���۰�����, ���� ����, ����ġ
		for(int i=4; -1<i && i<arr.length; i--) {
		
			System.out.println(arr[i]);
			
		}
		
	}
		
}


