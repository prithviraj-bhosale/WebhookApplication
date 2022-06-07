package ai.active.morfeus;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@OpenAPIDefinition( info = @io.swagger.v3.oas.annotations.info.Info(title = "Controller API's", version = "1.0", description = "Api's to help on controlling application layers"))
@Configuration
public class SwaggerConfig {

  @Bean
  public OpenAPI springShopOpenAPI() {
    return new OpenAPI().info(new Info().title("Controller").description("Starter code to integrate API's of Channels").version("v1.0.0")
        .license(new License().name("Apache 2.0").url("https://active.ai/")));
  }

}
