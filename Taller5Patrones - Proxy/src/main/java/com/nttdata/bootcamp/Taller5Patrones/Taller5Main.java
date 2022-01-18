package com.nttdata.bootcamp.Taller5Patrones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Taller 1 - Singleton
 * 
 * @author agadelao
 *
 */
@SpringBootApplication
public class Taller5Main {

	/** Método principal */
	public static void main(String[] args) {

		Person p = new Person("Alma", 32);
		p.operacion();

		System.out.println("---------------------");

		PersonProxy pp = new PersonProxy(p);
		pp.operacion();
	}

}
