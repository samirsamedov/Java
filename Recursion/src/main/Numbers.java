package main;

public class Numbers {

	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.print("0 1 ");
		fibonacci(0, 1, 10, 2);
		String sam = "Samir Samedov";
		System.out.println("\n");
		System.out.println(reverse(sam));;
	}

	public static int factorial(int limit) {
		if (limit <= 1)
			return 1;
		else
			return limit * factorial(limit - 1);
	}

	public static void fibonacci(int n1, int n2, int index, int count) {
		int newnum;
		if (count <= index) {
			newnum = n1 + n2;
			System.out.print(newnum + " ");
			fibonacci(n2, newnum, index, count + 1);
		}

	}
	
	public static String reverse(String str) {
	    if ((null == str) || (str.length() <= 1)) {
	        return str;
	    }
	    return reverse(str.substring(1)) + str.charAt(0);
	}
	/*
	 * 
up vote
58
down vote
accepted
The function takes the first character of a String - str.charAt(0) - puts it at the end 
and then calls itself - reverse() - on the remainder - str.substring(1), 
adding these two things together to get its result - reverse(str.substring(1)) + str.charAt(0)

When the passed in String is one character or less and so there will 
be no remainder left - when str.length()  <= 1) - it stops calling itself recursively
 and just returns the String passed in.
So it runs as follows:

reverse("Hello")
(reverse("ello")) + "H"
((reverse("llo")) + "e") + "H"
(((reverse("lo")) + "l") + "e") + "H"
((((reverse("o")) + "l") + "l") + "e") + "H"
(((("o") + "l") + "l") + "e") + "H"
"olleH"*/
}
