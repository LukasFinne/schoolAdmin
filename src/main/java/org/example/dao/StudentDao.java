package org.example.dao;

import org.example.Student;

public interface StudentDao {

    void create(Student student);

    void update(Student student);
    void delete(Student student);

}
