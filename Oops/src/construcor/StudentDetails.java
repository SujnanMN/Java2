package construcor;

public class StudentDetails {
	int age;
	String name;
	//default cons
	public StudentDetails()
	//cons with one para
	public StudentDetails(int age)
	{
		this.age=age;
	}
	//cons with two para
	public StudentDetails(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
}
