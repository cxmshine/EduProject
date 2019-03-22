package com.yuxiu.edu.service.base;

public interface IBaseService<T> {
    public T findById(Integer id);
    public T findByUUID(String UUID);

    public void deleteById(Integer id);
    public void deleteByUUID(String UUID);

    public void update(T t);

    public void insert(T t);
}
