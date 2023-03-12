import java.util.ArrayList;
import java.util.Date;
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Patron Info = Address,name,phone#,CreditRating,ConPerson,ConPhone,BankBranch-Chicago
		//Acct = Acct#, balance, dateOpened, customer - deposit, withdraw, 
			//Savings or Checking Acct
		
		ArrayList<AccountType> AccountType = new ArrayList<AccountType>();
		Customer patron = new Customer("224 Baker St","Sherlock","867-5309",420,"Watson","555-0808","Chicago");
		AccountType.addCustomer();
		//AccountType checking = new AccountType(701,456,Date);
		AccountType commercial = new AccountType(712,420, patron);
		AccountType.addcommercial();
		
		
	}
	public void BankMethod() {
		System.out.println();

		

	}

}

