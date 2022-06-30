package com.sky.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sky.domain.Product;
import com.sky.repository.ProductRepository;
@Service
public class ProductServiceImp1 implements ProductService {
	@Autowired
	@Qualifier("ProductRepositoryDBImpl")
	private ProductRepository productRepository;

	@Override
	public void addProduct(Product product) {
		System.out.println("in Service");
		if (product.getPrice() > 20) {
			productRepository.addProduct(product);
		
		}

	}

	@Override
	public List<Product> getProduct() {
		return productRepository.getProduct();
	}

	//@Override
	public Product getProductById(int id) {
		
		return productRepository.getProductById(id);
	}

//	@Override
//	public Product deleteById(String id) {
//		
//		return productRepository.deleteById(id);
//	}
	@Override
	public void deleteById(int id) {
		
		productRepository.deleteById(id);
	}


//	@Override
//	public Product updateById(Product product) {
//		return productRepository.updateById(product);
//	}
	@Override
	public void updateById(Product product) {
		 productRepository.updateById(product);
	}

	

	


}
