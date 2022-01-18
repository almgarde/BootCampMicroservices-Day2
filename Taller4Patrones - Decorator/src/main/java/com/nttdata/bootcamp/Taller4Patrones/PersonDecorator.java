package com.nttdata.bootcamp.Taller4Patrones;

/**
 * Clase Decorator de Person
 * 
 * @author agadelao
 *
 */
public class PersonDecorator implements IPersonDecorator {

	/** Atributo Person */
	private Person person;

	/** Método constructor */
	public PersonDecorator(Person person) {
		this.person = person;
	}

	/** Método Get para Name editado de Person */
	@Override
	public String getName() {
		return "Name: " + person.getName();
	}

	/** Método Get para Age editado de Person */
	@Override
	public int getAge() {
		return person.getAge() * 100;
	}

}
