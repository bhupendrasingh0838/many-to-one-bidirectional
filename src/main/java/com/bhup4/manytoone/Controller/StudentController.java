package com.bhup4.manytoone.Controller;

import com.bhup4.manytoone.Entity.Student;
import com.bhup4.manytoone.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController implements StudentService{
    @Autowired
    StudentService service;


    @GetMapping("/getData")
    public List<Student> getAll(){
        return (List<Student>) service.getAll();
    }

    @GetMapping("/getData/{id}")
    public Student getData(@PathVariable Long id){
        Student student = service.getData(id);
        return student;
    }

    @PostMapping("/create")
    public String create(@RequestBody Student student){
        service.create(student);
        return "Data Added Successfully";

    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);

    }
    @PutMapping("/update/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student student)
    {
        service.update(id,student);
        return  student;
    }
}
