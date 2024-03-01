package com.sefirot.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sefirot.bookstore.domain.Categoria;
import com.sefirot.bookstore.domain.Livro;
import com.sefirot.bookstore.repositories.CategoriaRepository;
import com.sefirot.bookstore.repositories.LivroRepository;

@Service
public class DBService {
	
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;	
	
	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "Informática", "Livros de TI");
		Categoria cat2 = new Categoria(null, "Ficção Científica", "Livros de Ficção Científica");
		Categoria cat3 = new Categoria(null, "Concursos Públicos", "Livros para Concursos");		
		
		Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Livro indispensável para estudo de programação", cat1);
		Livro l2 = new Livro(null, "Java: Como Programar", "Deitel", "Livro definitivo de Java", cat1);
		Livro l3 = new Livro(null, "Java: Use a cabeça", "Gustavo Sá", "Série boa sobre Java", cat1);
		Livro l4 = new Livro(null, "Linux", "Eriberto Mota Filho", "Melhor Livro de Linux que existe", cat1);
		
		Livro l5 = new Livro(null, "O Silmarillion", "J.R.R. Tolkien", "O melhor", cat2);
		Livro l6 = new Livro(null, "A queda de Gondolin", "J.R.R. Tolkien", "de todos", cat2);
		Livro l7 = new Livro(null, "Beren e Luthien", "J.R.R. Tolkien", "os tempos", cat2);
		
		Livro l8 = new Livro(null, "D. Penal", "Beltrano", "Estudar pra concurso", cat3);
		Livro l9 = new Livro(null, "D. Constitucional", "Fulano", "sem duvidas", cat3);
		Livro l10 = new Livro(null, "D. Administrativo", "Cicrano", "é uma merda", cat3);
		
		
		cat1.getLivros().addAll(Arrays.asList(l1, l2, l3, l4));
		cat2.getLivros().addAll(Arrays.asList(l5, l6, l7));
		cat3.getLivros().addAll(Arrays.asList(l8, l9, l10));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5, l6, l7, l8, l9, l10));		
	}

}
