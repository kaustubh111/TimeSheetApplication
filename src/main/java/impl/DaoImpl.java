package main.java.impl;

import java.util.ArrayList;
import java.util.List;

import main.java.service.GenericDAO;

public class DaoImpl<E,K> implements GenericDAO<E,K> {

	private List<E> entities = new ArrayList<E>();

	public void add(E entity) {
		// TODO Auto-generated method stub
		entities.add(entity);
	}

	public void remove(E entity) {
		// TODO Auto-generated method stub
		entities.remove(entity);
	}

	public void update(E entity) {
		// TODO Auto-generated method stub
		throw new RuntimeException();
	}

	public E find(K key) {
		// TODO Auto-generated method stub
		 if (entities.isEmpty()) {
			    return null;
		   }
			   return entities.get(0);

	}

	public List<E> list() {
		// TODO Auto-generated method stub
		return entities;
	}

	


	

}
