/**
 * CustomerServiceImpl.java
 * Fecha de creación: Jan 17, 2023, 8:07:52 PM
 */
package com.mexcrisoft.anyways.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mexcrisoft.anyways.entidad.Customer;
import com.mexcrisoft.anyways.service.CustomerService;

/**
 * Implementación del servicio de clientes
 * @author Cristian E. Ruiz Aguilar( cristianruiz1195@gmail.com)
 * @version 1.0
 * @since anyways 0.0.1-SNAPSHOT
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see
     * com.mexcrisoft.anyways.service.CustomerService#saveCustomer(com.mexcrisoft.
     * anyways.entidad.Customer)
     */
    public Customer saveCustomer(Customer customer) {
        return null;
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see com.mexcrisoft.anyways.service.CustomerService#getAllCustomers()
     */
    public List<Customer> getAllCustomers() {
        return null;
        // TODO [codificar el cuerpo del método]
    }



}
