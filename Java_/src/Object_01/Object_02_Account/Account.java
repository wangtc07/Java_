package Object_01.Object_02_Account;

public class Account {
	String fullNane ;
	long accountNum ;
	double blacnce ;
	public Account(String fullNane, long accountNum, double blacnce) {
		this.fullNane = fullNane;
		this.accountNum = accountNum;
		this.blacnce = blacnce;
	}
	
	public Account(String fullNane, long accountNum) {
		this(fullNane, accountNum, 5000.0);
	}

	public Account() {
		super();
	}

	void open(String fullNane, long accountNum, double blacnce) {
		this.fullNane = fullNane;
		this.accountNum = accountNum;
		this.blacnce = blacnce;
	}
	
	void deposit(double deposit) {
		if (deposit > 0) {
			blacnce += deposit;
			System.out.println("存入 " + deposit + "\n");
		}else {
			System.out.println("輸入錯誤");
		}
	}
	
	void withdraw(double withdraw) {
		if (withdraw > 0 && withdraw <= blacnce) {
			blacnce -= withdraw;
		}else if (withdraw < 0) {
			System.out.println("輸入錯誤");
		}else {
			System.out.println("超過餘額");
		}
		
	}
	
	void showAccount() {
		System.out.println("帳戶 " + fullNane);
		System.out.println("帳號 " + accountNum);
		System.out.println("餘額 " + blacnce);
	}
	
	double showBlance() {
		return blacnce;
	}	
}
