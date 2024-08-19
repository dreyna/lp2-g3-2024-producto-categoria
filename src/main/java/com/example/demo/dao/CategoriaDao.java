package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Categoria;



public interface CategoriaDao {
	Categoria create(Categoria p);
	Categoria update(Categoria p);
	void delete(Long id);
	Optional<Categoria> read(long id);
	List<Categoria> readAll();
}
