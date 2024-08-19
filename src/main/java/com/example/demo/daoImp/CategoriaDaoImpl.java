package com.example.demo.daoImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.CategoriaDao;
import com.example.demo.entity.Categoria;
import com.example.demo.repository.CategoriaRepository;
@Component
public class CategoriaDaoImpl implements CategoriaDao{

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Override
	public Categoria create(Categoria p) {
		// TODO Auto-generated method stub
		return categoriaRepository.save(p);
	}

	@Override
	public Categoria update(Categoria p) {
		// TODO Auto-generated method stub
		return categoriaRepository.save(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		categoriaRepository.deleteById(id);
	}

	@Override
	public Optional<Categoria> read(long id) {
		// TODO Auto-generated method stub
		return categoriaRepository.findById(id);
	}

	@Override
	public List<Categoria> readAll() {
		// TODO Auto-generated method stub
		return categoriaRepository.findAll();
	}

}
