package Object_01.Object_02_Account;

public class UseAccount {
	public static void main(String[] args) {
		Account peterAccount = new Account("Peter", 20210101, 1000);
		peterAccount.showAccount();
		System.out.println();
		
		peterAccount.deposit(2000);
		peterAccount.showAccount();
		System.out.println();
		
		peterAccount.withdraw(4000);
		peterAccount.showAccount();
	}
}
