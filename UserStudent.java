package Study;

import java.util.Scanner;

public class UserStudent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student std = new Student();
		
		System.out.println("Enter first name: ");
		String first = sc.nextLine();
		
		std.setFirstName(first);
		
		System.out.println("enter last name: ");
		String last = sc.nextLine();
		std.setLastName(last);
		
		System.out.println("Enter age");
		int age = sc.nextInt();
		std.setAge(age);
		
		System.out.println("Enter graduation year");
		int year = sc.nextInt();
		std.setGraduation_year(year);
		
		System.out.println("Enter stream");
		String stream = sc.next();
		std.setGraduation_stream(stream);
		
		
		System.out.println("First Name: "+std.getFirstName()+",Last name :"+std.getLastName()+",Age :"+std.getAge()+",Graduation year: "+std.getGraduation_year()+",Stream: "+std.getGraduation_stream());

	}

}
