package Study;

public class StringTest {

	public static void main(String[] args) {
		
		String s = new String();
		System.out.println(s);
		
		String s1 =new String("hiii");
		System.out.println(s1);
		
		char [] arr= {'a','d','c'};
		String s2 = new String(arr);
		System.out.println(s2);
		
		char[] arr1 = {'a','c','e','y','q','r'};
		String s3 = new String(arr1, 2,3);
		System.out.println(s3);

	}

}
