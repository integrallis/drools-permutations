package org.integrallis.drools;

public class Person /*implements Comparable<Person>*/ {
	private String name;

	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
//	public boolean equals(Object object) {
//		// short circuits
//		if (object == null)
//			return false;
//		if (this == object)
//			return true;
//		if (!(object instanceof Person))
//			return false;
//		final Person person = (Person) object;
//		return person.toString().equals(name);
//	}
//
//	public int compareTo(Person person) {
//		return toString().compareTo(person.toString());
//	}

}
