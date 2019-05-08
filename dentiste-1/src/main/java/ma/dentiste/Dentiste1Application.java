package ma.dentiste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import ma.dentiste.dao.PersonneRepository;
import ma.dentiste.entites.*;

@SpringBootApplication
public class Dentiste1Application {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(Dentiste1Application.class, args);
		PersonneRepository personneRepository=ctx.getBean(PersonneRepository.class);
		
		Patient patient1=new Patient();
		patient1.setCin("Ja175453");
		personneRepository.save(patient1);
		
		

}}
