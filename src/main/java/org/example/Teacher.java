package org.example;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "SMALLINT")
    private int TeacherId;

    @Column(length = 45)
    private String firstName;
    @Column(length = 45)
    private String lastName;

    @OneToOne(cascade = CascadeType.MERGE, orphanRemoval = true,fetch = FetchType.LAZY)
    @JoinColumn(name = "educationId", referencedColumnName = "educationId")
    private Education educationT;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "TeacherCourse",
            joinColumns = @JoinColumn(name = "teacherId"),
            inverseJoinColumns = @JoinColumn(name = "courseId"))
    private Set<Course> courseSet;

    public Teacher(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
        return educationT;
    }

    public void setEducation(Education education) {
        this.educationT = education;
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
                ", education=" + educationT +
                '}';
    }
}
