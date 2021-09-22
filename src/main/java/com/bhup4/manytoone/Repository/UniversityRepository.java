package com.bhup4.manytoone.Repository;

import com.bhup4.manytoone.Entity.University;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository extends CrudRepository<University,Long> {
}
