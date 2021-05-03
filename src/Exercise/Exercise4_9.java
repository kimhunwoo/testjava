package Exercise;

public class Exercise4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12345";
		int sum = 0;
		int n = 0;
		// str.length()  => 문자열의 길이
		for(int i=0; i<str.length(); i++) {
			n= str.charAt(i) - '0'; // 문자를 구해서 - '0' 하면 숫자가 됨.
			
			sum = sum + n;
		}
		System.out.println("sum=" + sum);
	}
//charAt(int i) 메서드는 문자열에서 i번째 문자를 반환한다
// str.charAt(0) => '1' - '0' => 1
}
