package generics;

public class GenericTest {
	public static <E> void pA(E[] elements )
	{
		for (E element : elements)
		{
			System.out.println(element);
		}
	}
	public static void main(String[] args) {
		Integer[] intA= {10,20};
		Character[] charA= {'a','b'};
		pA(intA);
		pA(charA);
		}
	}
