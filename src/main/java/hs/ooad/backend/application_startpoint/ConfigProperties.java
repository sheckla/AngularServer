package hs.ooad.backend.application_startpoint;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "mail")
public class ConfigProperties {
    private String port;
    
    void setPort(String port) {this.port = port;}
    String getPort() {return this.port;}
}
