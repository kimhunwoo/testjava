package Exfor;

public class ForDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int dan = 0, result = 0;
        
        for(dan=2; dan<=9; dan++) {
        	System.out.println(dan + "단 출력");
        	for(int i=1; i<=9; i++) {
        		result = dan * i ;
        		System.out.println(dan + " * " + i + " = " + result);
        	}
        	
        	System.out.println();
        }
        // 1부터 10까지 합을 구해보자.
        int sum = 0;
        
        for(int i=1; i<=10; i++) {
        	sum = sum + i;
        	System.out.println(i + "일때  sum=" + sum);
        }
        System.out.println(sum);
	}
	
}
