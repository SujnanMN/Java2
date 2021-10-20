package practise;

public class Debug {
		public static void main(String[] args) {
			Calculator calc = new Calculator();
			int sum = calc.add(10, 20);
			System.out.println("the sum is--"+sum);
			int n=10;
			for(int i=1; i<=n; i++)
			{
				sum=sum+n;
			}
		}
}
