 package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ProductController {
	@Autowired
	ProductService service;

	// Add product with image
	@PostMapping(value = "/add", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> addProduct(
            @RequestPart("product") ProductRequest product,
            @RequestPart("image") MultipartFile image) {
		
		

        try {
            service.saveProduct(product, image);
            return ResponseEntity.ok("Product added successfully");
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to add product");
        }
    }

	// Download product image
	@GetMapping("/{id}/image")
	public ResponseEntity<byte[]> getProductImage(@PathVariable Long id) {

		Product product = service.getProduct(id);

		return ResponseEntity.ok().contentType(MediaType.valueOf(product.getImageType()))
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + product.getImageName() + "\"")
				.body(product.getImageData());
	}

}
