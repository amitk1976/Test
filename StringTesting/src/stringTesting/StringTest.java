package stringTesting;

public class StringTest {
	public static void main(String args[]){
		String Str = "New string";
		String Str1 = "New string";
		int i; //= Str.length();
		
		 i =Str.codePointBefore(2);
		 System.out.println(Str.equalsIgnoreCase(Str1));
		 System.out.println(Str.equals(Str1));
		System.out.println(i);
	}

}
