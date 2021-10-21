/**
 * 
 */
package br.gov.ro.pge.sei.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author janon.sousa
 *
 */
@SpringBootApplication
@EnableAsync
public class SeiApiApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SeiApiApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SeiApiApplication.class, args);
	}
}
