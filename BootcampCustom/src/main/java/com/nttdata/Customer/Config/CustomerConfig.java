package com.nttdata.Customer.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@EnableWebFlux
@Configuration

public class CustomerConfig implements WebFluxConfigurer {
}