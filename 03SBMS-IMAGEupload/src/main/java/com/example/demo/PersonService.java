package com.example.demo;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class PersonService {
	@Autowired
	private PersonRepo irepo;

	public PersonInfo saveImage(MultipartFile file) throws IOException {

		PersonInfo per=new PersonInfo();
		per.setFileName(file.getOriginalFilename());
		per.setContentType(file.getContentType());
		per.setData(file.getBytes());

		return irepo.save(per);
	}

	public PersonInfo getImage(Long id) {
		return irepo.findById(id).orElseThrow(() -> new RuntimeException("Image not found"));
	}

}
