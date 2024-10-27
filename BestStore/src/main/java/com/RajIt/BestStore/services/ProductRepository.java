package com.RajIt.BestStore.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RajIt.BestStore.model.Product;

public interface ProductRepository  extends JpaRepository<Product, Integer>{

}
