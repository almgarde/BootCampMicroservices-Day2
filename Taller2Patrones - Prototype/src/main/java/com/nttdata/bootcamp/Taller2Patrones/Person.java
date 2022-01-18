package com.nttdata.bootcamp.Taller2Patrones;

/**
 * Clase Person
 * 
 * @author agadelao
 *
 */
public class Person implements IPrototypePerson {

	/** Nombre de Person */
	private String name;

	/** Edad de Person */
	private int age;

	/** Método constructor de Person */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/** Método Get de Name */
	public String getName() {
		return name;
	}

	/** Método Set de Name */
	public void setName(String name) {
		this.name = name;
	}

	/** Método Get de Age */
	public int getAge() {
		return age;
	}

	/** Método Set de Age */
	public void setAge(int age) {
		this.age = age;
	}

	/** Método clonador de Person */
	@Override
	public Person clone() {
		Person p = new Person(this.name, this.age);
		return p;
	}

}
