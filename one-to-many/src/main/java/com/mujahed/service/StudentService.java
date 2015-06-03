package com.mujahed.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mujahed.dao.StudentDao;
import com.mujahed.entity.Student;

@Service("studentService")
@Transactional
public class StudentService {

	@Autowired
	private StudentDao dao;

	public List<Student> getAllStudents() {
		return dao.findAllStudents();
	}
}
