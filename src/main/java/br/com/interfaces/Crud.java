package br.com.interfaces;

import java.util.List;

public interface Crud<T> {

    Integer create(T t);

    T update(T t);

    Boolean delete(Integer id);

    T findById(Integer id);

    List<T> getAll();
}
