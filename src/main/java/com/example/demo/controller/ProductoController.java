package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Producto;
import com.example.demo.service.ProductoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/productos")
public class ProductoController {

	@Autowired
	private ProductoService service;
	
	
	@GetMapping
	public ResponseEntity<List<Producto>> readAll(){
		try {
			List<Producto> products = service.readAll();
			if(products.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(products, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}	
	}
	@PostMapping
	public ResponseEntity<Producto> createProducto(@Valid @RequestBody Producto p ){
		try {
			Producto product = service.create(p);
			return new ResponseEntity<>(product, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}	
	}
	@GetMapping("/{id}")
	public ResponseEntity<Producto> readProducto(@PathVariable("id") Long id){
		Optional<Producto> prod = service.read(id);
		if(prod!=null) {
			return new ResponseEntity<>(prod.get(), HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Producto> delProducto(@PathVariable("id") Long id){
		try {
			service.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> editProducto(@PathVariable("id") Long id, @Valid @RequestBody Producto p ){
			Optional<Producto> opt = service.read(id);
			if(opt.isPresent()) {
				Producto pro = opt.get();
				pro.setNombre(p.getNombre());
				pro.setPrecio(p.getPrecio());
				pro.setCantidad(p.getCantidad());
				return new ResponseEntity<Producto>(service.update(pro),HttpStatus.OK);
				
			}else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
	}
}
