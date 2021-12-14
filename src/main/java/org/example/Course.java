package org.example;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;

    private String name;

    @OneToOne
    private Education education;

    @ManyToMany(targetEntity = Teacher.class)
    private Set teacherSet;

    public Course(String name, Set teacherSet) {
        this.name = name;
        this.teacherSet = teacherSet;
    }

    public Course() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Set getTeacherSet() {
        return teacherSet;
    }

    public void setTeacherSet(Set teacherSet) {
        this.teacherSet = teacherSet;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", name='" + name + '\'' +
                ", education=" + education +
                '}';
    }
}
