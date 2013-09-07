package org.ivvy.xfire;

import org.codehaus.xfire.aegis.type.java5.IgnoreProperty;
import org.codehaus.xfire.aegis.type.java5.XmlElement;
import org.codehaus.xfire.aegis.type.java5.XmlType;

@XmlType(name = "PERSON", namespace = "http://service.ivvy.org")
public class Person {

	private String name;
	private int age;
	private String email;

	@XmlElement(name = "NAME", namespace = "http://service.ivvy.org")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name = "AGE", namespace = "http://service.ivvy.org")
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@IgnoreProperty
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
