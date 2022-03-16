package br.com.interfaces;

public interface Crud<T> {

    Integer create(T t);

    T update(T t);

    Boolean delete(Integer id);

    T findById(Integer id);
}
