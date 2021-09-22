package com.bhup4.manytoone.Service;

import com.bhup4.manytoone.Entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    public List<Student> getAll();

    public Student getData(Long id);

    public String create(Student student);

    public void delete(Long id);

    public Student update(Long id,Student student);
}
