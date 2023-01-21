package com.mexcrisoft.anyways.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Anyways initializator
 * @author Cristian Ruiz (cristianruiz1195@gmail.com)
 * @version 1.0
 * @since Anyways 0.0.1-SNAPSHOT
 */
public class WebAppInitializer implements WebApplicationInitializer {

    /* La documentación de este método se encuentra en la clase o interface que
     * lo declara  (non-Javadoc)
     * @see org.springframework.web.WebApplicationInitializer#onStartup(javax.servlet.ServletContext)
     */
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        /*XmlWebApplicationContext context = new XmlWebApplicationContext();
        context.setConfigLocation("classpath:applicationContext.xml");*/
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(AnywaysAppConfig.class);
        // Create a dispatcher servlet object
        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
        // Registered the dispatcher servlet with the servlet context object
        ServletRegistration.Dynamic myCustomDispatcherServlet =
            servletContext.addServlet("myDispatchetServlet", dispatcherServlet);
        myCustomDispatcherServlet.setLoadOnStartup(1);
        myCustomDispatcherServlet.addMapping("/");
        context.close();
    }

}
