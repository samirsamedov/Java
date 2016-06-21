package model;

public class Person {

	private String name;
	private int personCount;
	
	
	public Person(String name){
		this.name=name;
		personCount++;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPersonCount() {
		return personCount;
	}


	public void setPersonCount(int personCount) {
		this.personCount = personCount;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", personCount=" + personCount + "]";
	}

	
	public static void printperson(Person p) {
		System.out.println(p.getName());
	}
	
	
}
