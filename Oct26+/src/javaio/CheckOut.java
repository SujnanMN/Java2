package javaio;

import java.io.FileOutputStream;

public class CheckOut {
	public static void main(String[] args) {
	 try{    
         FileOutputStream fout=new FileOutputStream("C:\\Users\\smn20\\OneDrive - DXC Production\\Desktop\\TestJavaIO.txt");  
         String s="Check output stream"; 
         byte b[]=s.getBytes();//converting string into byte array    
         fout.write(b);    
         fout.close();    
         System.out.println("Done");    
        }catch(Exception e){System.out.println(e);}    
  }    

}
