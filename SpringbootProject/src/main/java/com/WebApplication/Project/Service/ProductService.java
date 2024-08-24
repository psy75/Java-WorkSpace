package com.WebApplication.Project.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.WebApplication.Project.Model.Product;
import com.WebApplication.Project.Repository.ProductRepo;

@Service
public class ProductService {
	@Autowired
	ProductRepo repo;
	public List<Product> getProducts(){
		return repo.findAll();
	}
	public Product getproductById(int productId) {
		return repo.findById(productId).orElse(new Product());
	}
	public Product addProduct(Product product) {
		return repo.save(product);
	}
	public void updateProduct(Product product) {
		repo.save(product);
	}
	public void deleteProduct(int productId) {
		repo.deleteById(productId);
	}
	
	
	
	
//	List<Product> products=new ArrayList<>(Arrays.asList (new Product(101,"apple",50000),
//			                              new Product(102,"Samsung",60000),
//			                              new Product(103,"BlackBerry",40000)));
//	
//	public List<Product> getProducts(){
//		return products;
//	}
//
//	public Product getproductById(int productId) {
//		return products.stream()
//				.filter(p -> p.getProductId()==productId)
//				.findFirst().get();
//	}
//	
//	public void addProduct(Product product) {
//		products.add(product);
//	}
//
//	public void updateProduct(Product product) {
//		int index=0;
//		for(int i=0;i<products.size();i++) {
//			if(products.get(i).getProductId()==product.getProductId());
//			index=i;
//		}
//		products.set(index, product);
//	}
//
//	public void deleteProduct(int productId) {
//		int index=0;
//		for(int i=0;i<products.size();i++) {
//			if(products.get(i).getProductId()==productId);
//			index=i;
//		}
//		products.remove(index);	
//	}
	
}
