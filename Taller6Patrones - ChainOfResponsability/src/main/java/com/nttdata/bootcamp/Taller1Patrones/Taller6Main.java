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
public class Taller6Main {

	/** Método principal */
	public static void main(String[] args) {

		Unit soldado = new Unit("Soldado", null);

		Unit sargento = new Unit("Sargento", soldado);

		Unit capitan = new Unit("Capitán", sargento);

		capitan.executeCommand("Pelar papas");

	}

}
