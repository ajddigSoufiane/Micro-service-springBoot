package com.example.demo;

import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext; 

import com.example.demo.dao.SteRepository;
import com.example.demo.entities.Ste;

@EnableEurekaClient
@SpringBootApplication
public class ABourseServiceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(ABourseServiceApplication.class, args);
		SteRepository steR=ctx.getBean(SteRepository.class);
		Stream.of("A","C","F","D","f","T").forEach(s-> steR.save(new Ste(s)));
		steR.findAll().forEach(s-> System.out.println(s.getNomSociete()));
	}
}

/*@Configuration
class Myconfig extends RepositoryRestMvcConfiguration{
	@Override 
	protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		
		config.exposeIdsFor(Ste.class);
	}
	
	/*private void configureValidatignRepositoryEventListener(RepositoryRestConfiguration config) {
	 config.exposeIdsFor(Ste.class);
	}
}*/
