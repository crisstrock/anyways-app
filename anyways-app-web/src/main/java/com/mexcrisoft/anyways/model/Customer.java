/**
 * Customer.java
 * Fecha de creación: Jan 15, 2023, 11:16:56 PM
 */
package com.mexcrisoft.anyways.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Mapeo de tabla clientes
 * @author Cristian E. Ruiz Aguilar(cristianruiz1195@gmail.com)
 * @version 1.0
 * @since anyways 0.0.1-SNAPSHOT
 */
@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "firstName")
    private String nombre;
    @Column(name = "lastName")
    private String apellido;
    @Column(name = "birtday_date")
    private Date fechaNacimiento;
    @Column(name = "sex")
    private String sex;
    @Column(name = "rfc")
    private String rfc;
    @Column(name = "curp")
    private String curp;

    /**
     * @return el atributo id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id
     *            parametro id a actualizar
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return el atributo nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre
     *            parametro nombre a actualizar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return el atributo apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido
     *            parametro apellido a actualizar
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return el atributo fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento
     *            parametro fechaNacimiento a actualizar
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return el atributo sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     *            parametro sex a actualizar
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
     * @param rfc
     *            parametro rfc a actualizar
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
     * @param curp
     *            parametro curp a actualizar
     */
    public void setCurp(String curp) {
        this.curp = curp;
    }

}
