package hs.ooad.backend.application_startpoint;


public class ConfigProperties {
    private static ConfigProperties properties;
    private String port;

    private ConfigProperties() {}

    public static ConfigProperties getInstance() {
        if (properties == null) {
            properties = new ConfigProperties();
        }
        return properties;
    }
    
    public void setPort(String port) {this.port = port;}
    public String getPort() {return this.port;}
}
