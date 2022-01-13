package Study;

import java.util.Scanner;

public class MyString {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter string: ");
		
		String str=s.next();
		System.out.println(str);
		
		while(true)
		{
			showmenu();
			
			int opt = s.nextInt();
			if(opt==4)
			{
				System.out.println("Exit");
				break;
			}
			else if (opt>=5)
			{
				System.out.println("invalid choice");
			}
		
		switch(opt)
		{
		case 1:
		{
			System.out.println(str.length());
			break;
		}
		case 2:
		{
			System.out.println("Enter index :");
			int i = s.nextInt();
			System.out.println("original string :"+str);
			System.out.println("sub string : "+str.substring(i));
			break;
			
		}
		case 3:
		{
			String st = "";
			for (int i=str.length()-1; i>=0; i--)
				st = st+str.charAt(i);
			
		
		if(str.equals(st))
		{
			System.out.println(str+"string is palindrome");
		}
		else
		{
			System.out.println(str+" is not palindrom");
		}
		break;
		}
		default : 
			break;
		
		}	
	}
}

	
	
	private static void showmenu()
	{
		System.out.println("welcome");
		System.out.println("Enter 1 to show length of the string ");
		System.out.println("Enter 2 to show substring ");
		System.out.println("Enter 3 to show is the string is palindrome");
		System.out.println("Enter 4 to quite");
	}

}	


