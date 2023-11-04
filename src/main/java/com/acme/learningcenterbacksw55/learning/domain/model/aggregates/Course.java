package com.acme.learningcenterbacksw55.learning.domain.model.aggregates;


import com.acme.learningcenterbacksw55.learning.domain.model.valueobjects.LearningPath;
import com.acme.learningcenterbacksw55.shared.domain.model.entities.AuditableModel;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
public class Course extends AuditableModel {

    @Getter
    @Id
    private Long id;
    private String title;
    private String description;

    /**
     * The learning path for this course
     */
    @Getter
    @Embedded
    private LearningPath learningPath;
}
