package IndexOfChar;

public class IndexOfChar {
	
	public static void main(String[] args) {
		String sam ="samirsamedovaminaaliyeva";
		String mas ="Samir";
		
		System.out.println(sam.indexOf('m'));
		// it will return -1 because the char "x" doesnt exist
		System.out.println(sam.indexOf('x'));
		// ignore first 5 char
		System.out.println(sam.indexOf('m',5));
		// same thing with strings
		System.out.println(sam.indexOf("sam",3));
		
		 
		
	}

}
