package com.nttdata.bootcamp.Taller4Patrones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Taller 1 - Singleton
 * 
 * @author agadelao
 *
 */
@SpringBootApplication
public class Taller4Main {

	/** Método principal */
	public static void main(String[] args) {

		Person p = new Person("Alma", 32);

		PersonDecorator pd = new PersonDecorator(p);

		System.out.println(pd.getName() + ", " + pd.getAge());
	}

}
