/**
 * HomeController.java
 * Fecha de creación: Nov 21, 2022, 9:59:06 PM
 *
 * Copyright (c) 2022 Instituto Nacional Electoral. Dirección
 * Ejecutiva del Registro Federal de Electores.
 * Periférico Sur 239, México, D.F., C.P. 01010.
 * Todos los derechos reservados.
 *
 * Este software es información confidencial, propiedad del
 * Instituto Nacional Electoral. Esta información confidencial
 * no deberá ser divulgada y solo se podrá utilizar de acuerdo
 * a los términos que determine el propio Instituto.
 */
package com.mexcrisoft.anyways.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controlador principal
 * @author Cristian Ruiz (cristianruiz1195@gmail.com)
 * @version 1.0
 * @since Anyways 0.0.1-SNAPSHOT
 */
@Controller
public class HomeController {

	/**
	 * Inicio de la página
	 * @author Cristian Ruiz Aguilar (cristian.ruiz@ine.mx,
	 *         cristianruiz1195@gmail.com)
	 * @return view
	 */
	@RequestMapping("/")
	public String showHome() {
		return "home";
	}

}
