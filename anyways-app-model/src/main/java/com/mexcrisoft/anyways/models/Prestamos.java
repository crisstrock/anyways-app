/**
 * Prestamos.java
 * Fecha de creación: Aug 27, 2023, 11:48:43 AM
 */
package com.mexcrisoft.anyways.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Modelo para prestamos
 * @author Cristian E. Ruiz Aguilar (cristian.ruiz@ine.mx,
 *         cristianruiz1195@gmail.com)
 * @version 1.0
 * @since anyways 1.0.0
 */
@Entity
@Table(name = "PRESTAMOS", schema = "ANYWAYS")
public class Prestamos implements Serializable {
	/**
	 * Id del serializador
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private Long id;
	@Column(name = "MONTO")
	private double monto;
	@Column(name = "MONTO_INTERES")
	private double montoInteres;
	@Column(name = "PORCENTAJE_INTERES")
	private double porcentajeInteres;
	@Column(name = "TOTAL")
	private double total;
	@Column(name = "CUSTOMER_ID")
	private Long customerId;
	@Column(name = "FECHA_VENCIMIENTO")
	private Date fechaVencimiento;
	@Column(name = "ABONOS_TOTALES")
	private int abonosTotales;
	@Column(name = "USER_ID")
	private String creadoPor;
	@Column(name = "CREATED_AT")
	private Timestamp createdAt;
	@Column(name = "UPDATED_AT")
	private Timestamp updatedAt;

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
	 * @return el atributo monto
	 */
	public double getMonto() {
		return monto;
	}

	/**
	 * @param monto parametro monto a actualizar
	 */
	public void setMonto(double monto) {
		this.monto = monto;
	}

	/**
	 * @return el atributo montoInteres
	 */
	public double getMontoInteres() {
		return montoInteres;
	}

	/**
	 * @param montoInteres parametro montoInteres a actualizar
	 */
	public void setMontoInteres(double montoInteres) {
		this.montoInteres = montoInteres;
	}

	/**
	 * @return el atributo porcentajeInteres
	 */
	public double getPorcentajeInteres() {
		return porcentajeInteres;
	}

	/**
	 * @param porcentajeInteres parametro porcentajeInteres a actualizar
	 */
	public void setPorcentajeInteres(double porcentajeInteres) {
		this.porcentajeInteres = porcentajeInteres;
	}

	/**
	 * @return el atributo total
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * @param total parametro total a actualizar
	 */
	public void setTotal(double total) {
		this.total = total;
	}

	/**
	 * @return el atributo customerId
	 */
	public Long getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId parametro customerId a actualizar
	 */
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return el atributo fechaVencimiento
	 */
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	/**
	 * @param fechaVencimiento parametro fechaVencimiento a actualizar
	 */
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	/**
	 * @return el atributo abonosTotales
	 */
	public int getAbonosTotales() {
		return abonosTotales;
	}

	/**
	 * @param abonosTotales parametro abonosTotales a actualizar
	 */
	public void setAbonosTotales(int abonosTotales) {
		this.abonosTotales = abonosTotales;
	}

	/**
	 * @return el atributo creadoPor
	 */
	public String getCreadoPor() {
		return creadoPor;
	}

	/**
	 * @param creadoPor parametro creadoPor a actualizar
	 */
	public void setCreadoPor(String creadoPor) {
		this.creadoPor = creadoPor;
	}

	/**
	 * @return el atributo createdAt
	 */
	public Timestamp getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt parametro createdAt a actualizar
	 */
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * @return el atributo updatedAt
	 */
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * @param updatedAt parametro updatedAt a actualizar
	 */
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

}
