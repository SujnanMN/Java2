package inheritance;

public class Test {
	public static void main(String[] args) {
			Tax1 tax1 = new Tax1();
			Tax2 tax2 = new Tax2();
			int tax = tax2.calctax(50000);
			System.out.println("tax is  "+tax);
		}
}
