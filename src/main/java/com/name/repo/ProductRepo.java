package com.name.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.name.model.Product;
@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {

}
