/*�����߻� ->  Math.random()
 *  double �Ǽ�    0.0<= Math.random()<1  ������ ������ ���� �߻�����
 */
package Exif;

public class Simple0005 {

	public static void main(String[] args) {
     // 0 ~ 9������ ������ �߻�  => (int)(Math.random() * 10)
	 // 1 ~ 10 => (int)(Math.random() * 10) + 1
	 // 1 ~ 45 => (int)(Math.random() * 45) + 1
	 int num = (int)(Math.random() * 45) + 1;
	 System.out.println(num);
	 
	}
	
}
