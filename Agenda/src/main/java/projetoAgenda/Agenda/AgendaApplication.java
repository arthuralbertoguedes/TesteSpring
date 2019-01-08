package projetoAgenda.Agenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"model"})  // scan JPA entities
public class AgendaApplication {


	  private static ConfigurableApplicationContext applicationContext;

	  public static void main(String[] args) {
	    AgendaApplication.applicationContext = SpringApplication.run(AgendaApplication.class, args);
	  }
	}



