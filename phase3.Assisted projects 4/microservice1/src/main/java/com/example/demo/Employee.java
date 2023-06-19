package com.example.demo;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Employee {
	@Id
	private String user;
	private String password;
	private String email;
}



