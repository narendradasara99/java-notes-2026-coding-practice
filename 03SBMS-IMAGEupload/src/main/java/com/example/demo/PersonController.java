package com.example.demo;

import java.awt.Image;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class PersonController {
	@Autowired
	PersonService service;

	@PostMapping("/upload")
	public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {

		try {
			service.saveImage(file);
			return ResponseEntity.ok("Image uploaded successfully");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Image upload failed");
		}
	}
	
	@GetMapping("/download/{id}")
    public ResponseEntity<byte[]> getImage(@PathVariable Long id) {

         PersonInfo image = service.getImage(id);

        return ResponseEntity.ok()
                .contentType(MediaType.valueOf(image.getContentType()))
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment; filename=\"" + image.getFileName() + "\"")
                .body(image.getData());
    }
}


