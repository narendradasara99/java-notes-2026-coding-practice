package com.example.demo;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ProductService {
	@Autowired
	private ProductRepo repo;

	public Product saveProduct(ProductRequest request, MultipartFile image)
            throws IOException {

        Product product = new Product();
        product.setName(request.getName());
        product.setPrice(request.getPrice());
        product.setImageName(image.getOriginalFilename());
        product.setImageType(image.getContentType());
        product.setImageData(image.getBytes());

        return repo.save(product);
    }

	 public Product getProduct(Long id) {
	        return repo.findById(id)
	                .orElseThrow(() -> new RuntimeException("Product not found"));
	    }

}
