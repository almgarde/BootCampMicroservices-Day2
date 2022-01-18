package com.nttdata.bootcamp.Taller3Patrones;

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

	/** Método constructor de Person */
	private Person(PersonBuilder personBuilder) {
		this.name = personBuilder.name;
		this.age = personBuilder.age;
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

	/** Clase Builder de Person */
	public static class PersonBuilder {

		private String name;
		private int age;

		public PersonBuilder name(String name) {
			this.name = name;
			return this;
		}

		public PersonBuilder age(int age) {
			this.age = age;
			return this;
		}

		public Person build() {
			return new Person(this);
		}
	}

	/** Método instanciado de Builder */
	public static PersonBuilder builder() {
		return new PersonBuilder();
	}
}
