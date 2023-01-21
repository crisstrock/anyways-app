/**
 * FechaNacimientoFormatter.java
 * Fecha de creación: Jan 15, 2023, 11:37:56 PM
 */
package com.mexcrisoft.anyways.formatters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;

/**
 * Formateador de fecha de nacimiento
 * @author Cristian E. Ruiz Aguilar(cristianruiz1195@gmail.com)
 * @version 1.0
 * @since anyways 0.0.1-SNAPSHOT
 */
public class FechaNacimientoFormatter implements Formatter<Date> {

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see org.springframework.format.Printer#print(java.lang.Object,
     * java.util.Locale)
     */
    @Override
    public String print(Date object, Locale locale) {
        return null;
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see org.springframework.format.Parser#parse(java.lang.String,
     * java.util.Locale)
     */
    @Override
    public Date parse(String fechaNacimiento, Locale locale) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date date = formatter.parse(fechaNacimiento);
        return date;
    }


}
