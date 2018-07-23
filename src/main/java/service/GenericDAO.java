package main.java.service;

import java.util.List;

public interface GenericDAO<E,K> {

	void add(E entity);
	
	void remove(E entity);
	
	void update(E entity);
	
	 E find(K key);

	 List<E> list();

	
	
}
