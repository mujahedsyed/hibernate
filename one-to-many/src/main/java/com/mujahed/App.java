package com.mujahed;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mujahed.entity.Student;
import com.mujahed.service.StudentService;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {

	@Autowired
	static ApplicationContext ctx;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}