package br.com.pedro.apistarwars.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("br.com.pedro.apistarwars")
@EnableWebMvc
public class RootConfig {

}
