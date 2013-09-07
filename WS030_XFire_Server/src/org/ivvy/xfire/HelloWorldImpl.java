package org.ivvy.xfire;

import java.util.ArrayList;
import java.util.List;

public class HelloWorldImpl implements HelloWorld {

	@Override
	public String sayHello(String name) {
		return "Hello, " + name;
	}

	/**
	 * 演示使用WebService怎样传递对象。
	 * 
	 * @param name
	 * @return
	 */
	public Person getPerson(String name) {
		Person person = new Person();
		person.setAge(19);
		person.setName(name);
		person.setEmail(name + "的Email.");
		return person;
	}

	/**
	 * 演示使用WebService怎样传递数组。
	 * 
	 * @param n
	 * @return
	 */
	public List<Person> getPersons(int n) {
		Person p = null;
		List<Person> persons = new ArrayList<Person>();
		for (int i = 0; i < n; i++) {
			p = new Person();
			p.setAge(i);
			p.setName("ivvy_" + i);
			p.setEmail("Email_" + i);
			persons.add(p);
		}
		return persons;
	}

}
