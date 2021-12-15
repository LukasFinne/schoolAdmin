package org.example;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "SMALLINT")
    private int courseId;

    @Column(length = 50)
    private String name;


    @ManyToMany(mappedBy = "courseSet",fetch = FetchType.LAZY)
    private Set<Teacher> teacherSet;

    @OneToMany(mappedBy = "course",fetch = FetchType.LAZY)
    private List<CourseGrade> grade;

    public Course(String name) {
        this.name = name;
    }

    public Course(String name, Set teacherSet) {
        this.name = name;
        this.teacherSet = teacherSet;
    }

    public Course(String name, List<CourseGrade> grade) {
        this.name = name;
        this.grade = grade;
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

    public void setTeacherSet(Set<Teacher> teacherSet) {
        this.teacherSet = teacherSet;
    }

    public List<CourseGrade> getGrade() {
        return grade;
    }

    public void setGrade(List<CourseGrade> grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return courseId == course.courseId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", name='" + name + '\'' +
                ", teacherSet=" + teacherSet +
                ", grade=" + grade +
                '}';
    }
}
