package com.yuxiu.edu.mapper.base;

public interface BaseMapper<T> {

    public T findById(Integer id);
    public T findByUUID(String UUID);

    public void deleteById(Integer id);
    public void deleteByUUID(String UUID);

    public void update(T t);

    public void insert(T t);


}
