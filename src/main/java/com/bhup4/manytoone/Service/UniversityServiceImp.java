package com.bhup4.manytoone.Service;

import com.bhup4.manytoone.Entity.University;
import com.bhup4.manytoone.Repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityServiceImp implements UniversityService {

    @Autowired
    UniversityRepository repository1;

    @Override
    public List<University> getAllUni() {
        return (List<University>) repository1.findAll();
    }

    @Override
    public University getDataUni(Long id) {
        return repository1.findById(id).get();
    }

    @Override
    public String createUni(University university) {
        repository1.save(university);
        return "Data Created";
    }

    @Override
    public void deleteUni(Long id) {
        repository1.deleteById(id);

    }

    @Override
    public University updateUni(Long id, University university) {
        University university1 = repository1.findById(id).get();
        university1.setName(university.getName());
        university1.setCountry(university.getCountry());
        repository1.save(university1);
        return university1;

    }
}
