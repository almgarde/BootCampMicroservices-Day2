package com.nttdata.bootcamp.Taller5Patrones;

public class PersonProxy implements IPersonProxy {

	/** Atributo Person */
	private IPersonProxy person;

	/** Método constructo */
	public PersonProxy(IPersonProxy person) {
		this.person = person;
	}

	/** Método operación */
	@Override
	public void operacion() {
		before();
		this.person.operacion();
		after();
	}

	/** Método previo a ejecutar */
	public void before() {
		System.out.println("Comenzando operación");
	}

	/** Método posterior a ejecutar */
	public void after() {
		System.out.println("Operación finalizada");
	}

}
