import java.util.Date;

public class AccountType {
	 
	double AcctNum;
	double balance;
	//Date dateOpened; // add date method parameter
	Customer patron;
	
	

	public AccountType(double AcctNum, double balance, Customer patron) {
		this.AcctNum = AcctNum;
		this.balance = balance;
		
		this.patron = patron;
	}

}
