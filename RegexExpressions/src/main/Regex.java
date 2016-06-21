package main;

public class Regex {

	public static void main(String[] args) {

		// * 0 or more of previous expression.
		String any = ".*";
		String t1 = "Selam", t2 = "32", t3 = "";

		System.out.println(t1.matches(any));
		System.out.println(t2.matches(any));
		System.out.println(t3.matches(any));

		System.out.println("************");
		// + 1 or more of previous expression.
		String any2 = ".+";
		System.out.println(t1.matches(any2));
		System.out.println(t2.matches(any2));
		System.out.println(t3.matches(any2)); // 0 charachter so gives us false

		System.out.println("************");
		// \d Matches any decimal digit. Equivalent to \p{Nd} for Unicode and
		// [0-9] for non-Unicode, ECMAScript behavior.
		String any3 = "\\d*";
		System.out.println(t1.matches(any3)); // Selam is not a digit
		System.out.println(t2.matches(any3)); // 32 is a digit
		System.out.println(t3.matches(any3)); // "" is a digit too

		System.out.println("************");
		// | -> Alternation. (...) Logical grouping of part of an expression.
		String colorGroup = "(red|yellow|green)";
		System.out.println("red".matches(colorGroup));
		System.out.println("blue".matches(colorGroup));
		
		System.out.println("************");
		String eitherGray="gr(a|e)y";
		System.out.println("gray".matches(eitherGray));
		System.out.println("grey".matches(eitherGray));
		System.out.println("grem".matches(eitherGray));
		
		System.out.println("************");
		//?	0 or 1 of previous expression; also forces minimal matching when an expression might match several strings within a search string.
		String shoe ="shoe(s)?";
		System.out.println("shoe".matches(shoe));
		System.out.println("shoes".matches(shoe));
		System.out.println("shoess".matches(shoe));
		System.out.println("************");
		String shoe2 ="shoe(s)?s";
		System.out.println("shoe".matches(shoe2));
		System.out.println("shoes".matches(shoe2));
		System.out.println("shoess".matches(shoe2));

	}

}
