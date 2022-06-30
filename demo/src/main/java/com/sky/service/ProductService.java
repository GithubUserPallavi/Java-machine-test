package com.sky.service;

import java.util.List;

import com.sky.domain.Product;

public interface ProductService {
	public void addProduct(Product product);

	public List<Product> getProduct();

	public Product getProductById(int id);
	//public Product deleteById(String id);
	public void deleteById(int id);

	//public Product updateById(Product product);
	public void updateById(Product product);

	
	

	

}
