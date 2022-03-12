package hs.ooad.backend.application_startpoint;


public class ConfigProperties {
    private static ConfigProperties properties;
    private int port;

    private ConfigProperties() {}

    public static ConfigProperties getInstance() {
        if (properties == null) {
            properties = new ConfigProperties();
        }
        return properties;
    }
    
    public void setPort(int port) {this.port = port;}
    public int getPort() {return this.port;}
}
