package com.softelse.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.softelse.entities.Department;
import com.softelse.entities.User;
import com.softelse.repositories.DepartmentRepository;
import com.softelse.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Department d1 = new Department(null, "Gestao");
		Department d2 = new Department(null, "Informatica");
		departmentRepository.saveAll(Arrays.asList(d1, d2));
		
		User u1 = new User(null, "Maria", "maria@gmail.com");
		User u2 = new User(null, "Bob", "bob@gmail.com");
		User u3 = new User(null, "Alex", "alex@gmail.com");
		User u4 = new User(null, "Ana", "ana@gmail.com");
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4));
		
		u1.setDepartment(d1);
		u2.setDepartment(d1);
		u3.setDepartment(d2);
		u4.setDepartment(d2);
	
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4));
		
	}

}
