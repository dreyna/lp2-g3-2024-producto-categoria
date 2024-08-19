package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Producto;

public interface ProductoService {
	Producto create(Producto p);
	Producto update(Producto p);
	void delete(Long id);
	Optional<Producto> read(long id);
	List<Producto> readAll();
}
