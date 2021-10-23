package extra;

import java.util.Scanner;

public class SpecialSpaces {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=3;
		for (int i=0; i<n; i++)
		{
			String s=scan.next();
			int a=scan.nextInt();
			System.out.printf("%-15s%03d\n",s,a);
			
		}
		scan.close();
	}
}
