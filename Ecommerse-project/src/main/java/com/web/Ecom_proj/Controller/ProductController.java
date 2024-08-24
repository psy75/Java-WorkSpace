package com.web.Ecom_proj.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.web.Ecom_proj.Model.Product;
import com.web.Ecom_proj.Service.ProductService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {
	@Autowired
	private ProductService service;
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProducts(){
		return new ResponseEntity<>(service.getProducts(),HttpStatus.OK);
	}
//	@GetMapping("/products")
//	public List<Product> getProducts(){
//		return service.getProducts();
//	}
	@GetMapping("/products/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable int id) {
		Product product=service.getProductById(id);
		if(product!=null)
		    return new ResponseEntity<>(product,HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
//	@GetMapping("/products/{id}")
//	public Product getProduct(@PathVariable int id) {
//		return service.getProductById(id);
//	}
	@PostMapping("/products")
	public ResponseEntity<?> addProduct(@RequestPart Product product,
			                            @RequestPart MultipartFile imageFile){
		try {
			Product products=service.addProduct(product,imageFile);
			return new ResponseEntity<>(products,HttpStatus.CREATED);
		}
		catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
