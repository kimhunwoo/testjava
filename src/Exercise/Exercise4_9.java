package Exercise;

public class Exercise4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12345";
		int sum = 0;
		int n = 0;
		// str.length()  => ���ڿ��� ����
		for(int i=0; i<str.length(); i++) {
			n= str.charAt(i) - '0'; // ���ڸ� ���ؼ� - '0' �ϸ� ���ڰ� ��.
			
			sum = sum + n;
		}
		System.out.println("sum=" + sum);
	}
//charAt(int i) �޼���� ���ڿ����� i��° ���ڸ� ��ȯ�Ѵ�
// str.charAt(0) => '1' - '0' => 1
}
