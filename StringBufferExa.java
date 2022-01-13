package Study;

import java.util.Scanner;

public class StringBufferExa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter stirng : ");
		String s = sc.next();
		
		StringBuffer s1 = new StringBuffer(s);
		StringBuffer s2 = new StringBuffer(s1);
		
		StringBuffer srev=s1.reverse();
		System.out.println(srev);
		
		if(s2.toString().equals(s1.toString()))
		{
			System.out.println("String is palindrome");
			
		}
		else
			System.out.println("String is not palindrome");
		
		

	}

}
