package com.sky.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sky.domain.Product;
@Repository
public class ProductRepositoryImp1 implements ProductRepository {
 private static List<Product>products=new ArrayList<Product>();
	@Override
	public void addProduct(Product product) {
		System.out.println("in repository");
		products.add(product);
		
	}

	@Override
	public List<Product> getProduct() {
		return products;
	}
	@Override
	public Product getProductById(int id) {
		
		for (Product product : products) {
			if(product.getProductId()==id)
			{
				return  product;
			}
		}
		return null;
	}

//	@Override
//	public Product deleteById(String id) {
//		int index=0;
//		for (Product product : products) {
//			if(product.getProductId().equals(id))
//			{
//			products.remove(index);
//			
//				return  product;
//			}
//			index=index+1;
//		}
//		return null;
//	}
	

	//@Override
//	public Product updateById(Product newproduct) {
//  int index=0;
//		for (Product product : products) {
//			if(product.getProductId().equals(newproduct.getProductId()))
//			{
//				products.set(index, newproduct);
//				return newproduct;
//			}
//			index++;
//			
//		}
//		return null;
//	}

@Override
public void deleteById(int id) {
	// TODO Auto-generated method stub
	
}

@Override
public void updateById(Product product) {
	// TODO Auto-generated method stub
	
}
}
