package javaio;

import java.io.FileOutputStream;
import java.io.IOException;

public class CheckIostream {
	public static void main(String[] args) {
		try {
			FileOutputStream file = new FileOutputStream("C:\\Users\\smn20\\OneDrive - DXC Production\\Desktop\\TestJavaIO.txt");
			file.write(99);
			file.close();
			System.out.println("Success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
