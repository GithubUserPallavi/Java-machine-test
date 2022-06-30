package com.sky.repository;

import java.util.List;

import com.sky.domain.Product;

public interface ProductRepository {
	public void addProduct(Product product);

	public List<Product> getProduct();
	public Product getProductById(int id);
	public void deleteById(int id);
	
	public void updateById(Product product);
}
