package exception;

public class TestThrow1 {   
	//function to check if person is eligible to vote or not   
	public static void validate(int age) throws VoteElgibilityException {  
		if(age<18) {  
			//throw Arithmetic exception if not eligible to vote  
			throw new VoteElgibilityException();
			//ArithmeticException("Person is not eligible to vote");    
		}  
		else {  
			System.out.println("Person is eligible to vote!!");  
		}  
	}  
	//main method  
	public static void main(String args[]){  
		//calling the function  
		try {
			validate(15);
		} catch (VoteElgibilityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		System.out.println("rest of the code...");    
	}    
} 