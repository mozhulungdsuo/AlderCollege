package com.aldercollege.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"com.aldercollege"})
public class WebResolver 
{
	@Bean
	public InternalResourceViewResolver getViewResolver()
	{
		System.out.println("Resolver Called");
		InternalResourceViewResolver iRVResolver=new InternalResourceViewResolver();
		iRVResolver.setPrefix("/WEB-INF/jsp");
		iRVResolver.setSuffix(".jsp");
		return iRVResolver;
	}

	public void addResourceHandlers(ResourceHandlerRegistry registry) 
	    {
	            registry.addResourceHandler("/resources/**")
	            .addResourceLocations("/WEB-INF/resources/");
	    }
	     
	   
	     @Bean(name = "multipartResolver")  
	     public CommonsMultipartResolver getMultipartResolver(){
	           System.out.println("MultiPart");
	            CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver(); 
	            commonsMultipartResolver.setMaxUploadSize(100000000);
	            return commonsMultipartResolver;
	      }
}