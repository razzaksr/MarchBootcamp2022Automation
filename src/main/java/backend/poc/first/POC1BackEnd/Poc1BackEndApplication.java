package backend.poc.first.POC1BackEnd;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Poc1BackEndApplication {
	
	@Autowired
	ResourceService service;

	public static void main(String[] args) {
		SpringApplication.run(Poc1BackEndApplication.class, args);
	}

	/*
	@PostConstruct
	public void hai()
	{
		Resource res1=new Resource(2011, "Manoj Kumar M", new String[] {"java","bs"}, 20000, "Salem");
		Resource res2=new Resource(1982, "Madheshwaran M", new String[] {"django","flask"}, 19000, "Trichy");
		Resource res3=new Resource(912, "Titus C", new String[] {"angular","react"}, 24000, "Chennai");
		Resource res4=new Resource(1201, "Victor T", new String[] {"java","spring"}, 20000, "Madurai");
		
		service.create(res1);service.create(res2);service.create(res3);service.create(res4);
	}
	*/
}
