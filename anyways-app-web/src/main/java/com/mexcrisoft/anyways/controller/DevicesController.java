/**
 * DevicesController.java
 * Fecha de creación: Feb 6, 2023, 11:32:02 PM
 */
package com.mexcrisoft.anyways.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controlador de dispositivos
 * @author Cristian E. Ruiz Aguilar(cristianruiz1195@gmail.com)
 * @version 1.0
 * @since anyways 0.0.1-SNAPSHOT
 */
@Controller
@RequestMapping(value = "/devices")
public class DevicesController {

    /**
     * Muestra el home de dispositivos
     * @author Cristian E. Ruiz Aguilar (cristianruiz1195@gmail.com)
     * @return nombre de la vista JSP
     */
    @RequestMapping(value = "/")
    public String showHomeDevices() {
        return "devices_views/homeDevices";
    }
}
