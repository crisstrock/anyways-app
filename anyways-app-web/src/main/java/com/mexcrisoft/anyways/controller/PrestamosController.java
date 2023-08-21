/**
 * PrestamosController.java
 * Fecha de creación: Aug 20, 2023, 15:10:36 PM
 */
package com.mexcrisoft.anyways.controller;
/**
 * Modelo para usuarios
 * @author Cristian E. Ruiz Aguilar (cristian.ruiz@ine.mx, cristianruiz1195@gmail.com)
 * @version 1.0
 * @since Anyways 0.0.1
 */
@Controller
@RequestMapping("/prestamos")
public class PrestamosController {
 
	/**
     * Mapeo que muesta el home de las licencias
     * @author Cristian E. Ruiz Aguilar (cristianruiz1195@gmail.com)
     * @return nombre de la vista JSP
     */
    @RequestMapping("/")
    public String showPrestamos() {
        return "lend_views/home-lend";
    }
    
}
