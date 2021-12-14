package org.example;

import javax.persistence.*;
import java.util.List;

@Entity
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int educationId;

    private String name;

    @OneToMany(targetEntity = Course.class)
    private List courseList;


    public Education() {
    }

    public Education(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getCourseList() {
        return courseList;
    }

    public void setCourseList(List courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Education{" +
                "educationId=" + educationId +
                ", name='" + name + '\'' +
                '}';
    }
}
