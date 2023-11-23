/**
 * CustomerController.java
 * Fecha de creación: Jan 15, 2023, 10:05:42 PM
 */
package com.mexcrisoft.anyways.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mexcrisoft.anyways.forms.CustomerDTO;
import com.mexcrisoft.anyways.models.Customers;
import com.mexcrisoft.anyways.service.CustomerService;

/**
 * Controlador de clientes
 * @author Cristian E. Ruiz Aguilar(cristianruiz1195@gmail.com)
 * @version 1.0
 * @since anyways 0.0.1-SNAPSHOT
 */
@Controller
@RequestMapping("/customers")
public class CustomerController {
	private Logger logger = LoggerFactory.getLogger(CustomerController.class);
	@Autowired
	private CustomerService customerService;

	/**
	 * Mostrar la ventana de clientes
	 * @author Cristian E. Ruiz Aguilar (cristianruiz1195@gmail.com)
	 * @param model
	 * @return view
	 */
	@RequestMapping("/")
	public String showCustomer(Model model) {
		logger.debug("===> Método showCustomer");
		List<Customers> customers = customerService.getAllCustomers();
		model.addAttribute("customers", customers);
		return "customers_views/customers";
	}

	/**
	 * Vista para agregar nuevo cliente
	 * @author Cristian E. Ruiz Aguilar (cristianruiz1195@gmail.com)
	 * @param customer
	 * @return String
	 */
	@RequestMapping("/add-customer")
	public String addCustomer(@ModelAttribute("customerDTO") CustomerDTO customer) {
		logger.debug("===> Método showCustomer");
		return "customers_views/add-customers";
	}

	/**
	 * Procesamiento de clientes
	 * @author Cristian E. Ruiz Aguilar (cristianruiz1195@gmail.com)
	 * @param customer
	 * @param result
	 * @param model
	 * @return view
	 */
	@RequestMapping("/process_customer")
	public String processCustomer(@Valid @ModelAttribute("customerDTO") CustomerDTO customer, BindingResult result,
		ModelMap model) {
		if (result.hasErrors()) {
			List<ObjectError> allErrors = result.getAllErrors();
			for (ObjectError error : allErrors) {
				System.out.println("Error: " + error.getDefaultMessage());
			}
			return "customers_views/customers";
		}
		Customers cliente = new Customers();
		cliente.setFirstName(customer.getFirstName());
		cliente.setLastName(customer.getLastName());
		cliente.setBirtdayDate(customer.getFechaNacimiento());
		cliente.setSex(customer.getGenero());
		cliente.setRfc(customer.getRfc());
		cliente.setCurp(customer.getCurp());
		Map<String, Object> responseCliente = customerService.saveCustomer(cliente);
		customer = null;
		if (Integer.parseInt(responseCliente.get("value").toString()) == 1) {
			model.addAttribute("value", 1);
		} else {
			model.addAttribute("value", Integer.parseInt(responseCliente.get("value").toString()));
			model.addAttribute("description", responseCliente.get("description").toString());
		}
		return "customers_views/customers";
	}

}
