/*난수발생 ->  Math.random()
 *  double 실수    0.0<= Math.random()<1  사이의 임의의 수를 발생해줌
 */
package Exif;

public class Simple0005 {

	public static void main(String[] args) {
     // 0 ~ 9까지의 정수를 발생  => (int)(Math.random() * 10)
	 // 1 ~ 10 => (int)(Math.random() * 10) + 1
	 // 1 ~ 45 => (int)(Math.random() * 45) + 1
	 int num = (int)(Math.random() * 45) + 1;
	 System.out.println(num);
	 
	}
	
}
