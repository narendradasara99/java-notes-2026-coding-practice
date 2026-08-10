package com.example.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Integer pid;
	private String name;
	private String address;

    private LocalDate date;
    private LocalTime time;
    
    private String imageName;
    private String imagetype;
    @Lob
    private byte[] imageDate;
	public Person(Integer pid, String name, String address, LocalDate date, LocalTime time, String imageName,
			String imagetype, byte[] imageDate) {
		super();
		this.pid = pid;
		this.name = name;
		this.address = address;
		this.date = date;
		this.time = time;
		this.imageName = imageName;
		this.imagetype = imagetype;
		this.imageDate = imageDate;
	}
	public Person() {
		super();
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getImagetype() {
		return imagetype;
	}
	public void setImagetype(String imagetype) {
		this.imagetype = imagetype;
	}
	public byte[] getImageDate() {
		return imageDate;
	}
	public void setImageDate(byte[] imageDate) {
		this.imageDate = imageDate;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", address=" + address + ", date=" + date + ", time=" + time
				+ ", imageName=" + imageName + ", imagetype=" + imagetype + ", imageDate=" + Arrays.toString(imageDate)
				+ "]";
	}
	
    
	

	
}
