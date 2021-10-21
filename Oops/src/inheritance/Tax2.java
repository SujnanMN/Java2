package inheritance;

public class Tax2 extends Tax1 {
String aadhaarCard; // additional property/partition of the child class
	
	int calctax(int income) {
		// TODO Auto-generated method stub
		int tax = super.calctax(income); //reusing the functionality
		if(income > 10000) {
			  tax = income/5;
		}
		return tax;
	}

}
