package com.bhup4.manytoone.Service;

import com.bhup4.manytoone.Entity.Student;
import com.bhup4.manytoone.Entity.University;
import com.bhup4.manytoone.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    StudentRepository repository;

    @Override
    public List<Student> getAll() {
        return (List<Student>) repository.findAll();
    }

    @Override
    public Student getData(Long id) {
        return repository.findById(id).get();

    }

    @Override
    public String create(Student student) {
        repository.save(student);
        return "Data Created";
    }

    public void delete(Long id) {
        repository.deleteById(id);

    }

    @Override
    public Student update(Long id, Student student) {
        Student student1 =repository.findById(id).get();
        student1.setFirstName(student.getFirstName());
        student1.setLastName(student.getLastName());
        student1.setSection(student.getSection());
        repository.save(student1);
        return student1;

    }
}
