package org.example.dao;

import org.example.Course;


import java.util.Set;

public interface CourseDao {
    void create(Course course);
    Course getById(int id);
    Set<Course> toSet(Course course);
    void update(Course course);
    void delete(Course course);
}
