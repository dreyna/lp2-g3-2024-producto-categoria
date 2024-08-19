package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Categoria;

public interface CategoriaService {
	Categoria create(Categoria p);
	Categoria update(Categoria p);
	void delete(Long id);
	Optional<Categoria> read(long id);
	List<Categoria> readAll();
}
