package Study;

public class Student {
	
	private String firstName;
	private String lastName;
	private int age;
	private int graduation_year;
	private String graduation_stream;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		if(!firstName.trim().equals(" "))
		this.firstName = firstName;
		else 
			System.out.println("invalid name");
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		if(!lastName.trim().equals(" "))
		this.lastName = lastName;
		else
			System.out.println("invalid last name");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>18 && age<80)
		this.age = age;
		else 
			System.out.println("invalid age");
	}
	public int getGraduation_year() {
		return graduation_year;
	}
	public void setGraduation_year(int graduation_year) {
		if(graduation_year>=2018 && graduation_year<=2021)
		this.graduation_year = graduation_year;
		else
			System.out.println("invalid year");
	}
	public String getGraduation_stream() {
		return graduation_stream;
	}
	public void setGraduation_stream(String graduation_stream) {
		if(graduation_stream.equals("computer")|| graduation_stream.equals("mechanical") || graduation_stream.equals("civil"))
		this.graduation_stream = graduation_stream;
		else
			System.out.println("invalid stream");
	}
	
	
	

}
