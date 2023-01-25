/**
 * LoginController.java
 * Fecha de creación: Jan 24, 2023, 11:04:24 PM
 */
package com.mexcrisoft.anyways.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controlador de login de usuarios
 * @author Cristian E. Ruiz Aguilar(cristianruiz1195@gmail.com)
 * @version 1.0
 * @since anyways 0.0.1-SNAPSHOT
 */
@Controller
public class LoginController {

    /**
     * Muestra el formulario de login
     * @author Cristian E. Ruiz Aguilar (cristianruiz1195@gmail.com)
     * @return nombre de la vista
     */
    @GetMapping("/userLogin")
    public String showUserLogin() {
        return "users_views/login";
    }
}
