package org.example;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int TeacherId;

    private String firstName;
    private String lastName;

    @OneToOne
    private Education education;

    @ManyToMany(targetEntity = Course.class)
    private Set courseSet;

    public Teacher(String firstName, String lastName, Set courseSet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseSet = courseSet;
    }

    public Teacher() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Set getCourseSet() {
        return courseSet;
    }

    public void setCourseSet(Set courseSet) {
        this.courseSet = courseSet;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "TeacherId=" + TeacherId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", education=" + education +
                '}';
    }
}
