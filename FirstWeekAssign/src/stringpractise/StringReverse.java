package stringpractise;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
		String z="";
		char[] a=s.toCharArray();
		for (int i=a.length-1; i>=0; i--)
		{
			z+=a[i];
		}
		if (s.equals(z))
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}

}
