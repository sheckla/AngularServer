package hs.ooad.backend.application_startpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import hs.ooad.backend.application_startpoint.control.StartServer;

// mvnw compiler:compile
// mvnw install
// heroku deploy:jar .\target\whiteboard-0.0.1-SNAPSHOT.jar -nameless-river-96046
// heroku logs --tail
// git remote -v
// heroku git:remote -a nameless-river-96046
@SpringBootApplication
@ComponentScan({ "hs.ooad" })
@EnableConfigurationProperties(ConfigProperties.class)
public class ServerApplication {
	
	public static void main(String[] args) {
		for (String s : args) {
			System.out.println("arg: " + s);
		}
		
		ApplicationContext ctx = SpringApplication.run(ServerApplication.class, args);
		ConfigProperties prop = new ConfigProperties();
		System.out.println("port" + prop.getPort());
		StartServer startServer = (StartServer) ctx.getBean("startServer");
		startServer.startServer();
	}
	
}
