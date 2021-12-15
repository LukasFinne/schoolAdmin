package org.example;

import javax.persistence.*;

@Entity
public class CourseGrade {

    @EmbeddedId()
    CourseGradeKey id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("studentId")
    @JoinColumn(name = "studentId")
    Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("courseId")
    @JoinColumn(name = "courseId")
    Course course;

    //Using byte to get tinyint in mySQL
    byte grade;

    public CourseGrade(Student student, Course course, byte grade) {
        this.student = student;
        this.course = course;
        this.grade = grade;
    }

    public CourseGrade() {

    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public byte getGrade() {
        return grade;
    }

    public void setGrade(byte grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "CourseGrade{" +
                "id=" + id +
                ", student=" + student +
                ", course=" + course +
                ", grade=" + grade +
                '}';
    }
}
