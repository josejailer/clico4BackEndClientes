package co.unbosque.clico4BackEndClientes.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("co.unbosque.clico4BackEndClientes.controller"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(getApiInfo())
				;
	}
	
 	private ApiInfo getApiInfo() {
		return new ApiInfo(
				"API TIENDA GEN�RICA",
				"PROTECTO MINTIC",
				"Version: 1.0",
				"Desarrollador: Jos� Viveros",
				new Contact("Jos� Viveros","", "jailander52@gmail.com"),
				"LICENSE",
				"LICENSE URL",
				Collections.emptyList()
				);
	} 

}
