package BACKEND.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;
import BACKEND.repository.ciudadesrepo;


@Service
public class ciudadesservice implements ciudadesrepo {

	@Autowired
	private ciudadesrepo ciudadesrepository;
	
	@Override
	public List<BACKEND.model.ciudades> findAll() {
		return ciudadesrepository.findAll();
	}
	
	

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends BACKEND.model.ciudades> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends BACKEND.model.ciudades> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<BACKEND.model.ciudades> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BACKEND.model.ciudades getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BACKEND.model.ciudades getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BACKEND.model.ciudades getReferenceById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends BACKEND.model.ciudades> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends BACKEND.model.ciudades> List<S> findAll(Example<S> example,
			org.springframework.data.domain.Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends BACKEND.model.ciudades> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BACKEND.model.ciudades> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends BACKEND.model.ciudades> S save(S entity) {
		// TODO Auto-generated method stub
		return ciudadesrepository.save(entity);
	}

	@Override
	public Optional<BACKEND.model.ciudades> findById(Integer id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		ciudadesrepository.deleteById(id);
	}

	@Override
	public void delete(BACKEND.model.ciudades entity) {
		// TODO Auto-generated method stub
		ciudadesrepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends BACKEND.model.ciudades> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BACKEND.model.ciudades> findAll(org.springframework.data.domain.Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<BACKEND.model.ciudades> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends BACKEND.model.ciudades> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends BACKEND.model.ciudades> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends BACKEND.model.ciudades> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends BACKEND.model.ciudades> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends BACKEND.model.ciudades, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}
}
