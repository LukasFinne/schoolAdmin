package org.example;


import org.example.dao.EducationDao;
import org.example.impl.EducationImpl;

public class Main {
    public static void main( String[] args ) {
        EducationDao educationDao = new EducationImpl();
        /*educationDao.create(new Education("Javautvecklare"));
        educationDao.create(new Education("Applikationsutvecklare"));
        Education education = educationDao.getById(1);
        education.setName("Javautvecklare");
        educationDao.update(education);*/
    }
}
