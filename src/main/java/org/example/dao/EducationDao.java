package org.example.dao;

import org.example.Education;

public interface EducationDao {
    void create(Education education);
    Education getById(int id);
    void update(Education education);
    void delete(Education education);
}
