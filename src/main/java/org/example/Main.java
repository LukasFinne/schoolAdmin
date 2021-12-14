package org.example;


import org.example.dao.EducationDao;
import org.example.impl.EducationImpl;

public class Main {
    public static void main( String[] args ) {
        EducationDao educationDao = new EducationImpl();
    }
}
