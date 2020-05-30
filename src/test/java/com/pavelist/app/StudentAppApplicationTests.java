package com.pavelist.app;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pavelist.app.Repository.StudentsRepository;
import com.pavelist.app.domain.StudentEntity;

@SpringBootTest
class StudentAppApplicationTests {
    
	@Autowired
	StudentsRepository studentsRepository;
	
	
	@Test
	public void saveTest() {
		StudentEntity entity = new StudentEntity();
		entity.setName("Ahsan Ahmed");
		entity.setCourse("Core Java");
		entity.setFees(300d);
		studentsRepository.save(entity);
		
	}
	@Test
	public void findById() {
		Optional<StudentEntity>  student = studentsRepository.findById(2l);
		System.out.println(student);
		
	}
	
	@Test
	public void updateTest() {
		StudentEntity student = studentsRepository.findById(2l).get();
		student.setName("Yeakub Riyad");
		
		studentsRepository.save(student);
	}
	
	@Test
	public void deleteById() {
		StudentEntity entity = studentsRepository.findById(3l).get();
		studentsRepository.delete(entity);
	}

}
