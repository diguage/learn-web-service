package org.ivvy.xfire;

import java.util.List;

public interface HelloWorld {
	/**
	 * 演示简单的WebService
	 * 
	 * @param name
	 * @return
	 */
	String sayHello(String name);

	/**
	 * 演示使用WebService怎样传递对象。
	 * 
	 * @param name
	 * @return
	 */
	Person getPerson(String name);

	/**
	 * 演示使用WebService怎样传递数组。
	 * 
	 * @param n
	 * @return
	 */
	List<Person> getPersons(int n);
}
