package org.fundacionview.proyectoweb;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class ConfiguracionMsg {

	@Bean
public MessageSource misMensajes() {
	
		ResourceBundleMessageSource recursos=new ResourceBundleMessageSource();
		recursos.setBasename("messages");
		recursos.setCacheSeconds(10);
	
		return recursos;
}
	
	
	
}
