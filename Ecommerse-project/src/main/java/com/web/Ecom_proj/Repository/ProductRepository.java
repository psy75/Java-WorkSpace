package com.web.Ecom_proj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.Ecom_proj.Model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{

}
