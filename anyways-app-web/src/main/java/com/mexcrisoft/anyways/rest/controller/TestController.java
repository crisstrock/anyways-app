/**
 * TestController.java
 * Fecha de creación: Dec 6, 2023, 8:23:08 PM
 */
package com.mexcrisoft.anyways.rest.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controlador de prueba
 * @author Cristian E. Ruiz Aguilar (cristianruiz1195@gmail.com)
 * @version 1.0
 * @since anyways 0.0.1-SNAPSHOT
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {

	/**
	 * Realiza la prueba
	 * @author Cristian E. Ruiz Aguilar (cristianruiz1195@gmail.com)
	 * @param requestMap
	 * @return ResponseEntity
	 */
	@PostMapping(value = "/do-test")
	public ResponseEntity<?> doTest(@RequestBody(required = true) Map<String, String> requestMap) {
		try {
			ResponseEntity.ok().body(requestMap.get("test"));
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body(e);
		}
		return ResponseEntity.internalServerError().body("Ocurrió un error");
	}
}
