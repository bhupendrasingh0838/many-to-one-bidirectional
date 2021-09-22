package com.bhup4.manytoone.Service;

import com.bhup4.manytoone.Entity.Student;
import com.bhup4.manytoone.Entity.University;

import java.util.List;

public interface UniversityService {

    public List<University> getAllUni();

    public University getDataUni(Long id);

    public String createUni(University university);

    public void deleteUni(Long id);

    public University updateUni(Long id,University university);
}
