package main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import model.Person;

public class Main {

	public static void main(String[] args) {

		Person person = new Person("Samir");

		/*
		 * If your Person Class inherited from somewhere then
		 * 
		 * getDeclaredField -> getField() getDeclaredMethod() -> getMethod()
		 * 
		 */

		// System.out.println(person.name); not accesible this way

		// REFLECTION STARTS HERE
		try {
			Field field = person.getClass().getDeclaredField("name");
			field.setAccessible(true);
			System.out.println(field.get(person));
			System.out.println(person.getPersonCount());
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Field field = Person.class.getDeclaredField("personCount");
			field.setAccessible(true);
			// System.out.println(field.get(null));

		} catch (Exception e) {
			e.printStackTrace();
		}

		// now how to reach methods

		try {
			Method method = person.getClass().getDeclaredMethod("getName");
			System.out.println(method.invoke(person));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Now set name

		person.setName("Wonder");
		System.out.println(person.getName());

		person.setName("Samir");
		System.out.println(person.getName());

		try {
			Method method = person.getClass().getDeclaredMethod("setName", String.class);
			method.invoke(person, "Wonder");
			System.out.println(person.getName());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		Person sam = new Person("Engineer");
		Person.printperson(sam);
		
		try {
			Constructor<Person> constructor = Person.class.getDeclaredConstructor(String.class);
			sam = constructor.newInstance("Engineer");
			Person.printperson(sam);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
