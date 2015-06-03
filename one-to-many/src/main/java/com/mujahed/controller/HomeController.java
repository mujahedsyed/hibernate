package com.mujahed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mujahed.entity.Guide;
import com.mujahed.entity.Student;
import com.mujahed.service.GuideService;
import com.mujahed.service.StudentService;

@Controller
public class HomeController {

	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory
			.getLogger(HomeController.class);

	@Autowired
	private StudentService service;

	@Autowired
	private GuideService gService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		List<Student> students = service.getAllStudents();
		System.out.println("students $$$" + students.toString());

		List<Guide> guides = gService.getAllGuides();
		System.out.println("guides $$$" + guides.toString());

		//System.out.println("guide -> student");
		//for (Guide g : guides) {
			//System.out.println(g.getStudents().toString());
		//}

		System.out.println("student -> guide");
		for (Student s : students) {
			System.out.println(s.getGuide().toString());
		}
		return "index";
	}
}
