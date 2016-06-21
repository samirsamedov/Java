package bitwise;

public class BitwiseOperations {

	public static void main(String[] args) {
		/*
		 * P  	  	 Q       P && Q      P || Q	      P ^^ Q
		 *true 		true      true        true        false 
		 *true 		false     false       true        true
		 *false 	true      false       true        true
		 *false 	false     false       false       false 
		 * */
		
		/*
		  & Logical And
		  | Logical Or
		  ^ Logical Xor 
		 * */
		
		System.out.println(1 & 2);
		/*
		  0001
		& 0010
		------
		  0000   
		 * */
		
		System.out.println(1 | 2);
		/*
		  0001
		| 0010
		------
		  0011  
		 * */
		
		System.out.println(5 & 7);
		/*
		  0101
		& 0111
		------
		  0101  
		 * */
		
		System.out.println(8 | 7);
		/*
		  1000
		| 0111
		------
		  1111  
		 * */
		
		System.out.println(6 ^ 2);
		/*
		  0110
		^ 0010
		------
		  0100  
		 * */
		
		System.out.println(8 ^ 7);
		/*
		  1000
		^ 0111
		------
		  1111  
		 * */
		
		
		
	}

}
