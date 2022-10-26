package com.pxu.k18.exam.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.pxu.k18.exam.repository.AccountRepository;
import com.pxu.k18.exam.repository.AccountRepositoryImpl;
import com.pxu.k18.exam.service.AccountService;
import com.pxu.k18.exam.service.AccountServiceImpl;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {
	    "com.pxu.k18.exam"
	})
public class AppConfig {
	@Bean
    public InternalResourceViewResolver resolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/view/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
	
	@Bean
    public AccountService productService(){
        return new AccountServiceImpl();
    }

    @Bean
    public AccountRepository productRepository(){
        return new AccountRepositoryImpl();
    }

}