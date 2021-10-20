package com.nttdata.bootcamp.proyecto2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.bootcamp.proyecto2.config.SaludoProperties;
import com.nttdata.bootcamp.saludoidioma.classes.Saludo;

@SpringBootApplication
public class Proyecto2Application {
	
	
	@Autowired
	 SaludoProperties s;
	
	public static void main(String[] args) {
		SpringApplication.run(Proyecto2Application.class, args);
		
//		Saludo saludo = new Saludo("Ingles");
		//System.out.println( s.mensajeSaludo() );

	}

}
