package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.proyecto2.config.SaludoProperties;
import com.nttdata.bootcamp.saludoidioma.classes.Saludo;

@RestController
public class IndexController {

	@Autowired SaludoProperties saludoProperties;
	@Autowired Saludo saludo;
	
	@GetMapping("/saludo")
	@ResponseBody
	public String getSaludo() {
		System.out.println( saludoProperties.getIdioma() );
		return saludo.mensajeSaludo();
	}
}
