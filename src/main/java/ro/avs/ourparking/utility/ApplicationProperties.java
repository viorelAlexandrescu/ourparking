package ro.avs.ourparking.utility;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "app.config")
public class ApplicationProperties {

    @NotBlank
    private String dbUrl;

    @NotBlank
    private String apiKeyPath;
}
