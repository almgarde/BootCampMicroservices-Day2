package com.nttdata.bootcamp.Taller1Patrones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Taller 1 - Singleton
 * 
 * @author agadelao
 *
 */
@SpringBootApplication
public class Taller1Main {

	/** Método principal */
	public static void main(String[] args) {

		Person p = Person.getInstance();

		// Esta segunda instancia probocará que salga el mensaje de error
		Person p2 = Person.getInstance();

	}

}
