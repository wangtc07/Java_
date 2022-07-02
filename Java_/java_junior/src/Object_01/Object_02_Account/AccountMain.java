package Object_01.Object_02_Account;

public class AccountMain {
	public static void main(String[] args) {
//		Account peterAccount = new Account("Peter", 20210101, 1000);
//		peterAccount.showAccount();
//		System.out.println();
//		
//		peterAccount.open("Peter", 20210101, 1000);
//		
//		peterAccount.deposit(2000);
//		peterAccount.showAccount();
//		System.out.println();
//		
//		peterAccount.withdraw(4000);
//		peterAccount.showAccount();
		
		System.out.println("-----------");
		
		Account loanAccount = new CheckingAccount(5000, 0.1);
		loanAccount.showAccount();
		
		System.out.println("-----------");
		Account tinaAccount = new CheckingAccount("Tina", 123456789, 1000, 5000, 0.1 );
		tinaAccount.deposit(10000);
		tinaAccount.showAccount();
		System.out.println("-----------");

		tinaAccount.withdraw(12000);
		tinaAccount.showAccount();
	}
}
