package com.kapx.spring.batch.service;

import java.io.Serializable;

public interface ContactService<T, PK extends Serializable> {
	T save(T entity);
}