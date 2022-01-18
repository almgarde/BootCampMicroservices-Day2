package com.nttdata.bootcamp.Taller2Patrones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Taller 2 - Prototype
 * 
 * @author agadelao
 *
 */
@SpringBootApplication
public class Taller2Main {

	/** Método principal */
	public static void main(String[] args) {

		Person p = new Person("Alma", 32);

		Person p2 = p.clone();

		// Nos mostrará los mismos atributos que p
		System.out.println(p.getName() + ", " + p.getAge());
	}

}
