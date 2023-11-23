/**
 * LicensesController.java
 * Fecha de creación: Feb 6, 2023, 9:33:16 PM
 */
package com.mexcrisoft.anyways.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controlador de licencias
 * @author Cristian E. Ruiz Aguilar(cristianruiz1195@gmail.com)
 * @version 1.0
 * @since anyways 0.0.1-SNAPSHOT
 */
@Controller
@RequestMapping("/licenses")
public class LicensesController {

	/**
	 * Mapeo que muesta el home de las licencias
	 * @author Cristian E. Ruiz Aguilar (cristianruiz1195@gmail.com)
	 * @return nombre de la vista JSP
	 */
	@RequestMapping("/")
	public String showLicenses() {
		return "licenses_views/homeLicenses";
	}

}
