package com.example.demo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class PersonController {
	@Autowired
	private PersonRespo repo;

	@GetMapping("get")
	public Person get() throws IOException {
		String imageName="nature.jpeg";
		 File imageFile = new File("D:\\" + imageName);
		 String contentType="JPG";
		 
	     byte[] imageBytes = Files.readAllBytes(imageFile.toPath());
	     
		return new Person(1, "naren","tp",LocalDate.now(),LocalTime.now(),imageName,contentType,imageBytes);
	}

	@PostMapping("save")
	public String saveP(@RequestPart Person p,@RequestPart MultipartFile file) throws IOException {

		if (p.getName() != null) {
			p.setImageName(file.getOriginalFilename());
			p.setImagetype(file.getContentType());
			p.setImageDate(file.getBytes());
			Person save = repo.save(p);
			return "person saved";
		}
		return "preson name null";

	}

	@GetMapping("getPersons")
	public List<Person> getPersons() {
		return repo.findAll();
	}

}
