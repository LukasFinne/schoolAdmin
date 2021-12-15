package org.example;


import org.example.dao.CourseDao;
import org.example.dao.EducationDao;
import org.example.dao.StudentDao;
import org.example.dao.TeacherDao;
import org.example.impl.CourseImpl;
import org.example.impl.EducationImpl;
import org.example.impl.StudentImpl;
import org.example.impl.TeacherImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EducationDao educationDao = new EducationImpl();
        StudentDao studentDao = new StudentImpl();
        TeacherDao teacherDao = new TeacherImpl();
        CourseDao courseDao = new CourseImpl();

        //Education
     // educationDao.create(new Education("Javautvecklare"));
     // educationDao.create(new Education("Applikationsutvecklare"));
       Education education = educationDao.getById(1);
      /*  Education education = educationDao.getById(2);
       education.setName("Javautvecklare");
       educationDao.update(education);
       educationDao.delete(education);*/

        //student
       //studentDao.create(new Student("Lars", "Jacobsson"), education);
      // studentDao.create(new Student("Lukas", "Finne"), education);
       //studentDao.create(new Student("Yinn", "Lee"), education);


        //Teacher
      //
       // System.out.println(education);

        //teacherDao.create(new Teacher("Daniel", "Johansson"),education );

        courseDao.create(new Course("Utveckling"));
        Course course = courseDao.getById(1);
        education.setCourseSet(courseDao.toSet(course));

    }
}
