package com.acme.learningcenterbacksw55.learning.domain.model.entities;

import com.acme.learningcenterbacksw55.learning.domain.model.aggregates.Course;
import com.acme.learningcenterbacksw55.shared.domain.model.entities.AuditableModel;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class LearningPathItem extends AuditableModel {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @Getter
    @ManyToOne(optional = false)
    private Tutorial tutorial;

    @Getter
    @ManyToOne
    @JoinColumn(name = "next_item_id")
    private LearningPathItem nextItem;


    public LearningPathItem() {
        this.tutorial = null;
        this.nextItem = null;
    }

    public LearningPathItem(Course course, Tutorial tutorial, LearningPathItem nextItem) {
        this.course = course;
        this.tutorial = tutorial;
        this.nextItem = nextItem;
    }

    public void updateNextItem(LearningPathItem nextItem) {
        this.nextItem = nextItem;
    }


}
