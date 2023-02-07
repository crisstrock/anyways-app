/**
 * AccessDeniedController.java
 * Fecha de creación: Feb 6, 2023, 8:55:33 PM
 */
package com.mexcrisoft.anyways.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Contrador para accesos denegados
 * @author Cristian E. Ruiz Aguilar(cristianruiz1195@gmail.com)
 * @version 1.0
 * @since anyways 0.0.1-SNAPSHOT
 */
@Controller
@RequestMapping("/access-denied")
public class AccessDeniedController {

    /**
     * Mapea la ruta access-denied y la redirije a su vista personalizada
     * @author Cristian E. Ruiz Aguilar (cristian.ruiz@ine.mx,
     *             cristianruiz1195@gmail.com)
     * @return nombre de la vista jsp
     */
    @RequestMapping("/")
    public String getAccessDenied() {
        return "errors/accessDenied";
    }
}
