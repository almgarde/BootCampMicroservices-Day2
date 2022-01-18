package com.nttdata.bootcamp.Taller4Patrones;

/**
 * Clase Person
 * 
 * @author agadelao
 *
 */
public class Person implements IPersonDecorator {

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

	/** Método Get de Age */
	public int getAge() {
		return age;
	}

}
