package projetoAgenda.Agenda;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

	@RequestMapping("/")
	public String index() {
		System.out.println("oi");
		return "index";
	}
	
	@RequestMapping("/novoContato")
	public String redirect() {
		
		return "novoContato";
	}
	
	
	
	
	
}
