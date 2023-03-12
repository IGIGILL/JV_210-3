public class Savings extends AccountType {
	double IntRate;
	
	public Savings(double IntRate,double AcctNum, Customer patron) {
		super(AcctNum, AcctNum, patron);
		this.IntRate = IntRate;
	}

	public void intCalc() {
		balance = (IntRate * balance) + balance;
	}
}
