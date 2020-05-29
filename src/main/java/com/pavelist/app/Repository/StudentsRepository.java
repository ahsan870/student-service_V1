package com.pavelist.app.Repository;

import org.springframework.data.repository.CrudRepository;

import com.pavelist.app.domain.StudentEntity;

public interface StudentsRepository extends CrudRepository<StudentEntity, Long> {

}
