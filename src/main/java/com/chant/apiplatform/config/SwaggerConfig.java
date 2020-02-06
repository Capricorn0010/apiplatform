package com.chant.apiplatform.config;

import com.chant.apiplatform.constant.CommonConstant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

	@Bean
	public Docket createRestApi() {

		ParameterBuilder tokenPar = new ParameterBuilder();
		List<Parameter> pars = new ArrayList<>();
		tokenPar.name("Authorization")
				.description("令牌")
				.modelRef(new ModelRef("string"))
				.parameterType("header")
				.required(false)
				.defaultValue("Bearer eyJhbGciOiJIUzUxMiJ9.eyJpc3MiOiJiYWNrZW5kIiwic3ViIjoiMTU5MTk0ODIyNTQiLCJpYXQiOjE1NTk5NjU5MTgsImF1dGhvcml0eSI6WyJBR0VOVCIsIlNVUEVSX0FETUlOIl19.cFkOPTj5xyj_T3ett0IULW69aRYt0D1-chhXBLX5pxs3B4MTy9TeGMalCwJnxj-p81__gZt5Ek-_NPQxdVtsnQ")
				.build();
		pars.add(tokenPar.build());

		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("default")
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage(CommonConstant.BASE_PACKAGE))
				.paths(PathSelectors.any())
				.build().globalOperationParameters(pars);
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("CHANT API Platform")
				.build();
	}

}
