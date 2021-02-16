package com.avatar.commons;

import java.io.Serializable;
import java.util.List;

public interface IGenericService<Z, COU extends Serializable> {
	
	
	List<Z> Listado();

}
