package com.nttdata.bootcamp.Taller1Patrones;

/**
 * Clase Person
 * 
 * @author agadelao
 *
 */
public class Person {

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
