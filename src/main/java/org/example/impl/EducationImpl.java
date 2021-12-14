package org.example.impl;

import org.example.Education;
import org.example.dao.EducationDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EducationImpl implements EducationDao {

    EntityManagerFactory emf;
    EntityManager em;

    public EducationImpl() {
        emf = Persistence.createEntityManagerFactory("jpa");
        em = emf.createEntityManager();
    }

    @Override
    public void create(Education education) {
        em.getTransaction().begin();
        em.persist(education);
        em.getTransaction().commit();
    }

    @Override
    public void update(Education education) {

    }

    @Override
    public void delete(Education education) {

    }
}
