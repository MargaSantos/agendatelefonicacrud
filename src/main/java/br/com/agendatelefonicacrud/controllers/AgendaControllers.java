package br.com.agendatelefonicacrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.agendatelefonicacrud.entities.Agenda;
import br.com.agendatelefonicacrud.repositories.AgendaRepository;

@RestController
@RequestMapping(value = "/agenda")
public class AgendaControllers {
	
	
	@Autowired
	private AgendaRepository crudRepository;
	@GetMapping
	public Iterable<Agenda> findAll() {

		return crudRepository.findAll();
	}

	
	@GetMapping(value = "/{id}")
	public Agenda findById(@PathVariable Long id) {
		Agenda result = crudRepository.findById(id).get();
		return result;
		
	}
	
	@PostMapping
	public Agenda insert(@RequestBody Agenda agenda) {
		Agenda result = crudRepository.save(agenda);
		return result;
		
	}
	
	@GetMapping("/alterar/{id}") 
		public ModelAndView alterar(@PathVariable("id") Long id) {
			return alterar(id);
		
	}
	
	@DeleteMapping(value = "/{id}")
	public void remove(@PathVariable Long id) {
		crudRepository.deleteById(id);
	}
	
}
