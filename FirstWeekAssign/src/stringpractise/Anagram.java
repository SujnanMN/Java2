package stringpractise;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b=scan.next();
		int check=0;
		if (a.length()!=b.length())
		{
			System.out.println("Not Anagrams");
			check=1;
		}
		else
		{
			char[] aa=a.toUpperCase().toCharArray();
			char[] bb=b.toUpperCase().toCharArray();
			Arrays.sort(aa);
			Arrays.sort(bb);
			for (int i=0; i<a.length(); i++)
			{
				if (aa[i]!=bb[i])
				{
					System.out.println("Not Anagrams");
					check=1;
					break;
				}
			}
		}
		if (check==0)
			System.out.println("Anagrams");
	}

}
