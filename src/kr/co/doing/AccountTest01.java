package kr.co.doing;

public class AccountTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ü ����
		Account obj1 = new Account();
		Account obj2 = new Account();
		Account obj3 = new Account("�̼���"); 
		// ��ü ����        ��ü ����
		
		//��ü�� �Ӽ��� �Է�
//		obj1.accountNo = "123-2323-42323";
		obj1.setAccountNo("12312-121-31");
		obj1.ownerName = "ȫ�浿";
		obj1.balance = 50000;
		
		
//		obj2.accountNo = "2323-2323-3-23232";
		obj2.setAccountNo("323-2323-3232");
		obj2.ownerName = "����";
		obj2.balance = 2000;
		
		printAccount(obj1);
		printAccount(obj2);
		
//		System.out.println("���¹�ȣ : " + obj2.accountNo);
//		System.out.println("�����ָ� : " + obj2.ownerName);
//		System.out.println("�ܾ� : " + obj2.balance);
		
	}

	private static void printAccount(Account obj) {
		// TODO Auto-generated method stub
//		System.out.println("���¹�ȣ : " + obj.accountNo);
		System.out.println("���¹�ȣ : " + obj.getAccountNo());
		System.out.println("�����ָ� : " + obj.ownerName);
		System.out.println("�ܾ� : " + obj.balance);
	}

}
