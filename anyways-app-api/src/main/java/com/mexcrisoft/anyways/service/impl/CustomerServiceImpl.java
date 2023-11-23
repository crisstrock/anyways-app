/**
 * CustomerServiceImpl.java
 * Fecha de creación: Jan 17, 2023, 8:07:52 PM
 */
package com.mexcrisoft.anyways.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Service;

import com.mexcrisoft.anyways.models.Customers;
import com.mexcrisoft.anyways.repositories.CustomerRepository;
import com.mexcrisoft.anyways.service.CustomerService;

/**
 * Implementación del servicio de clientes
 * @author Cristian E. Ruiz Aguilar( cristianruiz1195@gmail.com)
 * @version 1.0
 * @since anyways 0.0.1-SNAPSHOT
 */
@Service
public class CustomerServiceImpl implements CustomerService {
	private Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);
	@Autowired
	private CustomerRepository customerRepository;

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo
	 * declara (non-Javadoc)
	 *
	 * @see
	 * com.mexcrisoft.anyways.service.CustomerService#saveCustomer(com.mexcrisoft.
	 * anyways.entidad.Customer)
	 */
	@Override
	public Map<String, Object> saveCustomer(Customers customer) {
		Map<String, Object> response = new HashMap<>();
		int value = 0;
		String description = "";
		Customers clienteGuardado = null;
		try {
			clienteGuardado = customerRepository.saveAndFlush(customer);
			if (clienteGuardado != null) {
				value = 1;
			} else {
				description = "No pudimos guardar la información del cliente en la base de datos";
			}
		} catch (JpaSystemException e) {
			logger.error("===> Exception: {}", e);
			value = -1;
			description = "Ocurrió un error mientras se intantaba guardar un cliente!";
		} finally {
			response.put("value", value);
			response.put("description", description);
			response.put("clienteGuardado", clienteGuardado);
		}
		return response;
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo
	 * declara (non-Javadoc)
	 *
	 * @see com.mexcrisoft.anyways.service.CustomerService#getAllCustomers()
	 */
	@Override
	public List<Customers> getAllCustomers() {
		return customerRepository.findAll();
	}

}
