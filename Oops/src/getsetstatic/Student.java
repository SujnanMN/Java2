package getsetstatic;

import getsetstatic.Util;

public class Student {
	String name; //partition 
	int age;
	
	/**
	 * default constructor
	 */
	public Student() {
		System.out.println("First: "+age+" "+name);
	}
	
	public Student(String name) {
		this.name = name;
		System.out.println("Second: "+age+" "+name);
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age+2;
		System.out.println("add age by two "+age+" "+name);
		this.age = Util.incrementByTen(age);
		System.out.println("Third: "+age+" "+name);
	}

	static String COLLEGE_NAME = "IIT";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}