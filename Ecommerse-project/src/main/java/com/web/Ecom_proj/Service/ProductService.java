package com.web.Ecom_proj.Service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.web.Ecom_proj.Model.Product;
import com.web.Ecom_proj.Repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
    private ProductRepository repo;
	
	public List<Product> getProducts() {
		return repo.findAll();
	}
	public Product getProductById(int id) {
		return repo.findById(id).orElse(null);
	}
	public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
		product.setImageName(imageFile.getOriginalFilename());
		product.setImageType(imageFile.getContentType());
		product.setImageData(imageFile.getBytes());
		return repo.save(product);
	}

}
