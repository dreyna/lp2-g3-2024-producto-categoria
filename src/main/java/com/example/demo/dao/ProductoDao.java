package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Producto;

public interface ProductoDao {
  
	Producto create(Producto p);
	Producto update(Producto p);
	void delete(Long id);
	Optional<Producto> read(long id);
	List<Producto> readAll();
}
