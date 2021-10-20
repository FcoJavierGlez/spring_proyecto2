package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import com.nttdata.bootcamp.proyecto2.config.SaludoProperties;

//@Controller
@RestController
@RequestMapping("/api/")
public class IndexController {

	@Autowired SaludoProperties s;
	
	@GetMapping("/saludos")
	@ResponseBody
	public String getSaludos() {
		return "ok";
	}
}
