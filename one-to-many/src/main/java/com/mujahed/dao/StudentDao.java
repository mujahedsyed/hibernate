package com.mujahed.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mujahed.entity.Student;

@Repository("studentDao")
public class StudentDao extends AbstractDao {

	public List<Student> findAllStudents() {
		List<Student> students = this.getSession()
				.createCriteria(Student.class).list();
		return students;
	}
}