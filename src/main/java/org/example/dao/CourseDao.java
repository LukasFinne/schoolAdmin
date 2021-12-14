package org.example.dao;

import org.example.Course;

public interface CourseDao {
    void create(Course course);
    void update(Course course);
    void delete(Course course);
}
