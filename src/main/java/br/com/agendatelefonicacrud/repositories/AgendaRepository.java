package br.com.agendatelefonicacrud.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import br.com.agendatelefonicacrud.entities.Agenda;

public interface AgendaRepository extends CrudRepository<Agenda, Long>{
	
}
