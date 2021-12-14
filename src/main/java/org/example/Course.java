package org.example;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;

    private String name;

    @ManyToMany(targetEntity = Teacher.class)
    private Set teacherSet;

    @ManyToMany(targetEntity = Student.class)
    private List studentList;

    public Course(String name, Set teacherSet) {
        this.name = name;
        this.teacherSet = teacherSet;
    }

    public Course(String name, List studentList) {
        this.name = name;
        this.studentList = studentList;
    }

    public Course() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set getTeacherSet() {
        return teacherSet;
    }

    public void setTeacherSet(Set teacherSet) {
        this.teacherSet = teacherSet;
    }

    public List getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", name='" + name + '\'' +
                ", teacherSet=" + teacherSet +
                ", studentList=" + studentList +
                '}';
    }
}
