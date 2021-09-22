package com.bhup4.manytoone.Controller;

import com.bhup4.manytoone.Entity.Student;
import com.bhup4.manytoone.Entity.University;
import com.bhup4.manytoone.Service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UniversityController implements UniversityService {

    @Autowired
    UniversityService service1;

    @GetMapping("/getDataUni")
    public List<University> getAllUni(){
        return (List<University>) service1.getAllUni();
    }

    @GetMapping("/getDataUni/{id}")
    public University getDataUni(@PathVariable Long id){
        University university= service1.getDataUni(id);
        return university;
    }

    @PostMapping("/createUni")
    public String createUni(@RequestBody University university){
        service1.createUni(university);
        return "Data Added Successfully";

    }
    @DeleteMapping("/deleteUni/{id}")
    public void deleteUni(@PathVariable Long id){
        service1.deleteUni(id);
    }
    @PutMapping("/updateUni/{id}")
    public University updateUni(@PathVariable Long id, @RequestBody University university) {
        service1.updateUni(id,university);
        return university;
    }
}
