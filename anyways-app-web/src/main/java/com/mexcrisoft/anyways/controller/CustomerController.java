/**
 * CustomerController.java
 * Fecha de creación: Jan 15, 2023, 10:05:42 PM
 */
package com.mexcrisoft.anyways.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mexcrisoft.anyways.forms.CustomerDTO;
import com.mexcrisoft.anyways.model.Customer;
import com.mexcrisoft.anyways.service.CustomerService;

/**
 * Controlador de clientes
 * @author Cristian E. Ruiz Aguilar(cristianruiz1195@gmail.com)
 * @version 1.0
 * @since anyways 0.0.1-SNAPSHOT
 */
@Controller
@RequestMapping(value = "/customers/*")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    /**
     * Mostrar la ventana de clientes
     * @author Cristian E. Ruiz Aguilar (cristianruiz1195@gmail.com)
     * @param customer
     * @return view
     */
    @RequestMapping("/home")
    public String showCustomer(@ModelAttribute("customerDTO") CustomerDTO customer) {
        System.out.println("Cliente: " + customer.getFirstName());
        return "customers_views/customers";
    }

    /**
     * TODO [Agregar documentacion al método]
     * @author Cristian E. Ruiz Aguilar (cristian.ruiz@ine.mx,
     *             cristianruiz1195@gmail.com)
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
        Customer cliente = new Customer();
        cliente.setNombre(customer.getFirstName());
        cliente.setApellido(customer.getLastName());
        cliente.setFechaNacimiento(customer.getFechaNacimiento());
        cliente.setSex(customer.getGenero());
        cliente.setRfc(customer.getRfc());
        cliente.setCurp(customer.getCurp());
        cliente = customerService.saveCustomer(cliente);
        System.out.println("Devolviendo cliente: " + cliente.getNombre());
        model.addAttribute("customer", cliente);
        return "customers_views/response";
    }

}
