package org.example.javaconsole.logging;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration
@ComponentScan
@EnableWebMvc
public class MainApplication extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer
{

    @Override
    protected Class<?>[] getServletConfigClasses()
    {
	return new Class[] {MainApplication.class};
    }

    @Override
    protected String[] getServletMappings()
    {
	return new String[] {"/"};
    }

    @Override
    protected Class<?>[] getRootConfigClasses()
    {
	return null;
    }



}
