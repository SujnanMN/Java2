package stringpractise;

import java.util.Scanner;

public class SubstringComp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.nextLine();
		int a=scan.nextInt();
		int n=s.length();
		String b=s.substring(0,a);
		String min;
		String max=min=s.substring(0,a);
		for (int i=a;i<=n-a; i+=a)
		{
			String c=s.substring(i,i+a);
			if (c.compareTo(max)>0)
			max=c;
			if (c.compareTo(min)<0)
			min=c;
		}
		System.out.println("Mininmum is: "+min);
		System.out.println("Maximum is: "+max);
		scan.close();

	}

}