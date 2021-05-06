package Object_01.Object_02_Account;

public class CheckingAccount extends Account {
	double maxLoan;
	double rate;
	double loan;
	
	
	public CheckingAccount(String fullNane, long accountNum, double blacnce, double maxLoan, double rate) {
		super(fullNane, accountNum, blacnce);
		this.maxLoan = maxLoan;
		this.rate = rate;
	}

	public CheckingAccount(double maxLoan, double rate) {
		super();
		this.maxLoan = maxLoan;
		this.rate = rate;
	}


	@Override
	void withdraw(double withdraw) {
//		super.withdraw(withdraw);
		
		if (withdraw < 0) {
			System.out.println("輸入錯誤");
		}else if (withdraw > blacnce && withdraw-blacnce < maxLoan) {
			double advance = withdraw - blacnce;
			loan = advance + advance * rate;
			System.out.println("溢領 " + advance);
			System.out.println("手續費" + advance * rate + "\n");
			blacnce = blacnce - withdraw + advance;  //餘額等於 餘額-提領金額+借貸
		}else if (withdraw-blacnce > maxLoan) {
			System.out.println("超出可借貸金額");
		}else if (withdraw <= blacnce) {
			blacnce -=  withdraw;
			System.out.println("提領" + withdraw + "\n");
		}
	}


	@Override
	void showAccount() {
		super.showAccount();
		System.out.println("借貸 " + loan);
//		System.out.println("利率 " + rate);
	}
	
	
}
