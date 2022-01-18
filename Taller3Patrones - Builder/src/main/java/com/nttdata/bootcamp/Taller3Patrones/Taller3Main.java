package com.nttdata.bootcamp.Taller3Patrones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Taller 2 - Prototype
 * 
 * @author agadelao
 *
 */
@SpringBootApplication
public class Taller3Main {

	/** Método principal */
	public static void main(String[] args) {

		Person p = Person.builder().name("Alma").age(32).build();

		System.out.println(p.getName() + ", " + p.getAge());
	}

}
