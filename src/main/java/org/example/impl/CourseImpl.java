package org.example.impl;

import org.example.Course;
import org.example.dao.CourseDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CourseImpl implements CourseDao {
    EntityManagerFactory emf;
    EntityManager em;

    public CourseImpl() {
        emf = Persistence.createEntityManagerFactory("jpa");
        em = emf.createEntityManager();
    }

    @Override
    public void create(Course course) {
        em.getTransaction().begin();
        em.persist(course);
        em.getTransaction().commit();
    }

    @Override
    public Course getById(int id) {
        return em.find(Course.class, id);
    }

    @Override
    public Set<Course> toSet(Course course) {
        Set<Course> set = new HashSet<>();
        set.add(course);
        return set;
    }

    @Override
    public void update(Course course) {

    }

    @Override
    public void delete(Course course) {

    }
}
