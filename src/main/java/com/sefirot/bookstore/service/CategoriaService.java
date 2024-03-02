package com.sefirot.bookstore.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sefirot.bookstore.domain.Categoria;
import com.sefirot.bookstore.repositories.CategoriaRepository;
import com.sefirot.bookstore.service.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repository;
	
	public Categoria findById(Integer id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto: " + id + ", Tipo: " + Categoria.class.getName() + " ; Não encontrado!"));
	}

}