package Study;

import java.util.Scanner;

public class WrapperExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x=0;
		while(x++ <=5)
		{
			System.out.println("Enter password : ");
			String str = sc.next();
			boolean a= verify(str);
			if(a==true)
			{
				System.out.println("pass is right");
				break;
			}
			else {
				System.out.println("try again");
				continue;
			}
		}

	}
	private static boolean verify(String str)
	{
		String pass ="Shri$123";
		if((str.equals(pass)))
		{
			return true;
		}
		else
			return false;
		

	}

}
