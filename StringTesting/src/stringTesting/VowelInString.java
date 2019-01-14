package stringTesting;

public class VowelInString {
	
	public static void main(String [] args){
		String vovel = "AIOUE";
		String A = "I LOVE INDIA BECAUSE ITS GREAT COUNTRY";
		//String B=A.equalsIgnoreCase(anotherString)
		int b = 0;
		
		for (int i = 0; i<A.length(); i++){
			for (int j =0; j<vovel.length(); j++ ){
				if(A.charAt(i)== vovel.charAt(j)){
					
					b++;
					
				}
					
			}
			
		}
		System.out.println(b);
		
		
	}

}
