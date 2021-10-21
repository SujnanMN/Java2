package methodoverride;

public class Test {

	public static void main(String[] args) {
		Sbi sbi = new Sbi();
		Hdfc hdfc = new Hdfc();
		Bank bank = new Bank();
		System.out.println("At Bank: "+bank.rest());
		System.out.println("At SBI: "+sbi.rest());
		System.out.println("At HDFC: "+hdfc.rest());
	}

}
