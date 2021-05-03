package Exercise;

public class Exercise4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 6; i++) { // i주사위
			for(int j=1; j<=6; j++) { // j주사위
				if(i + j == 6) {
					System.out.println("i= " + i + " , j= " + j + " : " + (i+j));
				}
			}
		}

	}


}


