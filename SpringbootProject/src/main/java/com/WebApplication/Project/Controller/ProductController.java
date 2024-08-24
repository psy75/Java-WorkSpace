package com.WebApplication.Project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.WebApplication.Project.Model.Product;
import com.WebApplication.Project.Service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService service;
	
	//@RequestMapping("/products")
	@GetMapping("/products")
	public List<Product> getProducts() {
		return service.getProducts();
	}
	//@RequestMapping("/products/{productId}")
	@GetMapping("/products/{productId}")
	public Product getProductById(@PathVariable int productId) {
		return service.getproductById(productId);
	}
	//@RequestMapping("/products")
	@PostMapping("/products")
	public void addProduct(@RequestBody Product product) {
		service.addProduct(product);
	}
	@PutMapping("/products")
	public void updateProduct(@RequestBody Product product) {
		service.updateProduct(product);
	}
	@DeleteMapping("/products/{productId}")
	public void deleteProduct(@PathVariable int productId) {
		service.deleteProduct(productId);
	}

}
