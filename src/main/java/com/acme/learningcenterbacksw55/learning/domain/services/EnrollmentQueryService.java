package com.acme.learningcenterbacksw55.learning.domain.services;

import com.acme.learningcenterbacksw55.learning.domain.model.aggregates.Enrollment;
import com.acme.learningcenterbacksw55.learning.domain.model.queries.GetEnrollmentByIdQuery;
import com.acme.learningcenterbacksw55.learning.domain.model.queries.GetStudentEnrollmentsQuery;

import java.util.List;
import java.util.Optional;

public interface EnrollmentQueryService {

    List<Enrollment> handle(GetStudentEnrollmentsQuery query);

    Optional<Enrollment> handle(GetEnrollmentByIdQuery query);
}
