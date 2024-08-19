package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CategoriaDao;
import com.example.demo.entity.Categoria;
import com.example.demo.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService{
	@Autowired
	private CategoriaDao categoriaDao;
	@Override
	public Categoria create(Categoria p) {
		// TODO Auto-generated method stub
		return categoriaDao.create(p);
	}

	@Override
	public Categoria update(Categoria p) {
		// TODO Auto-generated method stub
		return categoriaDao.update(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		categoriaDao.delete(id);
	}

	@Override
	public Optional<Categoria> read(long id) {
		// TODO Auto-generated method stub
		return categoriaDao.read(id);
	}

	@Override
	public List<Categoria> readAll() {
		// TODO Auto-generated method stub
		return categoriaDao.readAll();
	}

}
