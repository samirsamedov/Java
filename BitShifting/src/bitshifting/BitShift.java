package bitshifting;

public class BitShift {

	public static void main(String[] args) {

		/*
		 * 8 00001000 2 00000010
		 */

		/*
		 * 8 00001000 
		 * Start       00001000 =8 
		 * Shift once  00000100 =4 
		 * Shift twice 00000010 =2
		 */
		System.out.println(8 >> 2);
		
		/*
		 * 8 00001000 
		 * Start       00001000 =8 
		 * Shift once  00010000 =16 
		 * Shift twice 00100000 =32
		 */
		System.out.println(8 << 2);

	}

}
