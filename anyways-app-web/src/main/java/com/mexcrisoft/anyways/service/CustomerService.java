/**
 * CustomerService.java
 * Fecha de creación: Jan 17, 2023, 8:07:16 PM
 */
package com.mexcrisoft.anyways.service;

import java.util.List;

import com.mexcrisoft.anyways.model.Customer;

/**
 * Servicio de clientes
 * @author Cristian E. Ruiz Aguilar(cristianruiz1195@gmail.com)
 * @version 1.0
 * @since anyways 0.0.1-SNAPSHOT
 */
public interface CustomerService {


    /**
     * Guarda un cliente
     * @author Cristian E. Ruiz Aguilar (cristianruiz1195@gmail.com)
     * @param customer
     * @return Customer
     */
    Customer saveCustomer(Customer customer);

    /**
     * Obtiene unalista con todos los clientes
     * @author Cristian E. Ruiz Aguilar (cristianruiz1195@gmail.com)
     * @return lista de clientes
     */
    List<Customer> getAllCustomers();

}
