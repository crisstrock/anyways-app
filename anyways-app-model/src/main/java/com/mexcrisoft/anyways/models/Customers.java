/**
 * Customers.java
 * Fecha de creación: Aug 27, 2023, 12:01:18 PM
 */
package com.mexcrisoft.anyways.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Modelo para clientes
 * @author Cristian E. Ruiz Aguilar (cristian.ruiz@ine.mx,
 *         cristianruiz1195@gmail.com)
 * @version 1.0
 * @since anyways 1.0.0
 */
@Entity
@Table(name = "customer", schema = "ANYWAYS")
public class Customers implements Serializable {
	/**
	 * Id del serializador
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "BIRTDAY_DATE")
	private Date birtdayDate;
	@Column(name = "SEX")
	private String sex;
	@Column(name = "RFC")
	private String rfc;
	@Column(name = "CURP")
	private String curp;

	/**
	 * @return el atributo id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id parametro id a actualizar
	 */
	public void setId(Long id) {
		this.id = id;
	}

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
	 * @return el atributo birtdayDate
	 */
	public Date getBirtdayDate() {
		return birtdayDate;
	}

	/**
	 * @param birtdayDate parametro birtdayDate a actualizar
	 */
	public void setBirtdayDate(Date birtdayDate) {
		this.birtdayDate = birtdayDate;
	}

	/**
	 * @return el atributo sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex parametro sex a actualizar
	 */
	public void setSex(String sex) {
		this.sex = sex;
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
