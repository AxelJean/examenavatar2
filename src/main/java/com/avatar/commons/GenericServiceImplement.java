package com.avatar.commons;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract class GenericServiceImplement<Z, COU extends Serializable> implements IGenericService<Z, COU> {

	
	public abstract JpaRepository<Z, COU> getDao();
	
	

	@Override
	public List<Z> Listado() {
		
		return getDao().findAll();
	}
	
	
	
	
	
	
	

}
