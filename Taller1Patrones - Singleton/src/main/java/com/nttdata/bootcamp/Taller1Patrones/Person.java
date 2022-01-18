package com.nttdata.bootcamp.Taller1Patrones;

/**
 * Clase Person
 * 
 * @author agadelao
 *
 */
public class Person {
	
	// ACLARACIÓN: Se que en la formación se dijo que debía de haber una clase Person y otra clase correspondiente
	// a su Singleton, pero vi que eso no tenía sentido porque para hacer eso debo tener el constructor de Person
	// público para que sea accesible y poder instanciarlo en otra clase. Con eso conseguimos que sí se pueda 
	// instanciar y hacer un new en la clase Main. Por tanto, el singleton debe de ir en la misma clase Person.

	/** Nombre de Person */
	private String name;

	/** Edad de Person */
	private int age;
	
	/** Atributo Person */
	private static Person INSTANCE = null;

	/** Método constructor de Person */
	private Person() {
	
	}
	
	/** Metodo instanciador de Person */
	public static Person getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new Person();
		} else {
			System.out.println("Ya se ha realizado una instancia");
		}
		return INSTANCE;
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

}
