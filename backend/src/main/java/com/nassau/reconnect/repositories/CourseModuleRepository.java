package com.nassau.reconnect.repositories;


import com.nassau.reconnect.models.CourseModule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseModuleRepository extends JpaRepository<CourseModule, Long> {

    List<CourseModule> findByCourseIdOrderByOrderAsc(Long courseId);

    List<CourseModule> findByCourseIdAndIsLockedFalse(Long courseId);
}