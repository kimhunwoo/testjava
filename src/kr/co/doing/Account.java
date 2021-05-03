/* ������� Ŭ���� -> Account
 *  - �Ӽ�
 *  ���¹�ȣ      -> String accountNo
 *  ������ �̸�   -> String ownerName
 *  �ܾ�         -> int balance
 *   - ���
 *   �����Ѵ� -> void deposit(int amount);
 *   �����Ѵ� -> int withdraw(int amount);
 *
 * Ŭ������ Ư¡ : �Ӽ��� ���, ���, �������̵�, �����ε�, ĸ��ȭ, ������
 * �������̽� : final�ʵ�, �߻�޼ҵ�� ���� => ����
 * 
 */

package kr.co.doing;

public class Account {
	private String accountNo;
	String ownerName;
	int balance;
	
	Account(){} // ����Ʈ������
	Account(String ownerName){
		this.ownerName = ownerName;
	}
	
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	void deposit(int amount) {
		balance += amount;
	}
	
	int withdraw(int amount) {
		if(balance < amount) 
			return 0;
		balance -= amount;
		return amount;
	}
	
	
	
	
	
	
}
