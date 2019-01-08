package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Contato;

public interface ContatoRepository extends JpaRepository<Contato,Long>{
	
}