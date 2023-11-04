package com.acme.learningcenterbacksw55.learning.infraestructure.persistence.jpa.repositories;

import com.acme.learningcenterbacksw55.learning.domain.model.aggregates.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseRepository  extends JpaRepository<Course, Long> {
}
