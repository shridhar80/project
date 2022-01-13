package Study;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		while (true)
		{
			System.out.println("Enter first and last name: ");
			String str = s.nextLine();
			if(str.equalsIgnoreCase("quite"))
			{
				break;
				
			}
			String []names=str.split(" ");
			String n= names[0].substring(0, 1);
			String n1= n.toUpperCase();
			String n2= names[0].substring(1, names[0].length());
			String n3 = n2.toLowerCase();
			String n4= names[1].substring(0, 1);
			String n5= n4.toUpperCase();
			String n6= names[1].substring(1, names[1].length());
			String n7= n6.toLowerCase();
			
			String first= n1+n3;
			String second = n5+n7;
			
			System.out.println("welcome "+first+" "+second);
		}

	}

}
