package org.example;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "SMALLINT")
    private int studentId;

    @Column(length = 45)
    private String firstName;
    @Column(length = 45)
    private String lastName;

    @OneToOne(cascade = CascadeType.MERGE, orphanRemoval = true,fetch = FetchType.LAZY)
    @JoinColumn(name = "educationId", referencedColumnName = "educationId")
    private Education education;

    @OneToMany(mappedBy = "student",fetch = FetchType.LAZY, orphanRemoval = true)
    List<CourseGrade> grade;


    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student() {
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

    public List<CourseGrade> getGrade() {
        return grade;
    }

    public void setGrade(List<CourseGrade> grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", education=" + education +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
}
