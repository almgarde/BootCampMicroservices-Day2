package com.nttdata.bootcamp.Taller1Patrones;

/**
 * Clase Person
 * 
 * @author agadelao
 *
 */
public class Unit {

	/** Nombre de Unit */
	private String unitName;

	/** Subordinados de Unit */
	private Unit subordinate;

	/** Método constructor */
	public Unit(String unitName, Unit subordinate) {
		this.unitName = unitName;
		this.subordinate = subordinate;
	}

	/** Método Get del Name */
	public String getUnitName() {
		return unitName;
	}

	/** Método Set del Name */
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	/** Método Get del Subordinate */
	public Unit getSubordinate() {
		return subordinate;
	}

	/** Método Get del Subordinate */
	public void setSubordinate(Unit subordinate) {
		this.subordinate = subordinate;
	}

	/** Método de ejecución de órdenes */
	public void executeCommand(String command) {

		// Si posee subordinados, delega la orden
		if (this.subordinate == null) {
			System.out.println("Orden: " + command + ", Ejecutada por: " + this.unitName);
		} else {
			subordinate.executeCommand(command);
		}

	}

}
