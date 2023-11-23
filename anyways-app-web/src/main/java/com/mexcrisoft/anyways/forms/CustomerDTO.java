/**
 * CustomerDTO.java
 * Fecha de creación: Jan 15, 2023, 11:10:45 PM
 */
package com.mexcrisoft.anyways.forms;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Clase intermediaria entre el cliente y el servidor
 * @author Cristian E. Ruiz Aguilar(cristianruiz1195@gmail.com)
 * @version 1.0
 * @since Anyways 0.0.1-SNAPSHOT
 */
public class CustomerDTO {
	@NotBlank(message = " * Your name can't be blank")
	@Size(min = 3, max = 50, message = "* Your name should have char between 3 - 50")
	private String firstName;
	@NotBlank(message = " * Your last Name can't be blank")
	@Size(min = 3, max = 100, message = "* Your name should have char between 3 - 100")
	private String lastName;
	private Date fechaNacimiento;
	private String genero;
	private String rfc;
	private String curp;

	/**
	 * @return el atributo firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName parametro firstName a actualizar
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return el atributo lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName parametro lastName a actualizar
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return el atributo fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento parametro fechaNacimiento a actualizar
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return el atributo genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero parametro genero a actualizar
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return el atributo rfc
	 */
	public String getRfc() {
		return rfc;
	}

	/**
	 * @param rfc parametro rfc a actualizar
	 */
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	/**
	 * @return el atributo curp
	 */
	public String getCurp() {
		return curp;
	}

	/**
	 * @param curp parametro curp a actualizar
	 */
	public void setCurp(String curp) {
		this.curp = curp;
	}

}
