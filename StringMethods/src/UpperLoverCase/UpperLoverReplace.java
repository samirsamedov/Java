package UpperLoverCase;

public class UpperLoverReplace {

	public static void main(String[] args) {
		String mas ="Samir";
		String monster="monster";
		String tiny ="TINY";
		mas.replace('S', 'K');
		
		String trim ="    samir      samedov       ";
		// replace just changing the value for a moment not permanently
		System.out.println(mas.replace('S', 'K'));
		System.out.println(mas);
		System.out.println(monster.toUpperCase());
		System.out.println(tiny.toLowerCase());
		// trim method removes white spaces from front and from behind
		System.out.println(trim.trim());
		
	}

}
