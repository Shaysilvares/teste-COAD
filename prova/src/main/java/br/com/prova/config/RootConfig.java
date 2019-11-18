package br.com.prova.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 
 * @author Shayna Bauer
 * @since 17/11/2019
 */
@Configuration
@ComponentScan("br.com.prova")
@EnableWebMvc
public class RootConfig {

}