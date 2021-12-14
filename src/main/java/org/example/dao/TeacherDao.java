package org.example.dao;

import org.example.Teacher;

public interface TeacherDao {
    void create(Teacher teacher);
    void update(Teacher teacher);
    void delete(Teacher teacher);
}
