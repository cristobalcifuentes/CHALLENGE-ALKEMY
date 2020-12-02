package com.cristobal.alkemy.service.interfaces;

import java.util.List;

public interface ICRUDService<T> {
	
	T registrar(T obj);
	T modificar(T obj);
	List<T> listar();
	T leerPorId(Integer id);
	boolean eliminar(Integer id);

}
