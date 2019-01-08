package resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import model.Contato;
import repository.ContatoRepository;

@RestController
@RequestMapping(value="api")
public class ContatoResource {
	
	@Autowired
	ContatoRepository produtoRepository;
	
	@GetMapping("contatos")
	public List<Contato> getContatos(){
		System.out.println("estou aqui");
		return produtoRepository.findAll();
	
	}	
	
}
