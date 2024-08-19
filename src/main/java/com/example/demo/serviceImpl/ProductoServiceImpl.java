package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductoDao;
import com.example.demo.entity.Producto;
import com.example.demo.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService{
	@Autowired
	private ProductoDao dao; 

	@Override
	public Producto create(Producto p) {
		// TODO Auto-generated method stub
		return dao.create(p);
	}

	@Override
	public Producto update(Producto p) {
		// TODO Auto-generated method stub
		return dao.update(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Producto> read(long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Producto> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
