
public class Savings extends AccountType {
	double IntRate;

	public Savings(double IntRate) {
		get.IntRate = IntRate;
	}
	public void intCalc(){
		balance = (IntRate * balance) + balance; 
	}
}
