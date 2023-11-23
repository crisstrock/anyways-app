/**
 * CustomerRepository.java
 * Fecha de creación: Aug 27, 2023, 12:30:15 PM
 *
 * Copyright (c) 2023 Instituto Nacional Electoral. Dirección
 * Ejecutiva del Registro Federal de Electores.
 * Periférico Sur 239, México, D.F., C.P. 01010.
 * Todos los derechos reservados.
 *
 * Este software es información confidencial, propiedad del
 * Instituto Nacional Electoral. Esta información confidencial
 * no deberá ser divulgada y solo se podrá utilizar de acuerdo
 * a los términos que determine el propio Instituto.
 */
package com.mexcrisoft.anyways.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mexcrisoft.anyways.models.Customers;

/**
 * Repositorio de bases de datos
 * @author Cristian E. Ruiz Aguilar (cristian.ruiz@ine.mx,
 *         cristianruiz1195@gmail.com)
 * @version 1.0
 * @since SIIRFE 6.6
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customers, Long> {

}
