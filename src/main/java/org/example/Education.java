package org.example;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int educationId;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "courseId")
    private Set<Course> courseSet;

    @OneToOne(mappedBy = "education")
    private Student student;

    @OneToOne(mappedBy = "education")
    private Teacher teacher;


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

    public Set<Course> getCourseSet() {
        return courseSet;
    }

    public void setCourseSet(Set<Course> courseSet) {
        this.courseSet = courseSet;
    }

    @Override
    public String toString() {
        return "Education{" +
                "educationId=" + educationId +
                ", name='" + name + '\'' +
                ", courseSet=" + courseSet +
                '}';
    }
}
