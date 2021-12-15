package org.example;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "SMALLINT")
    private int educationId;

    @Column(length = 70)
    private String name;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "courseId")
    private Set<Course> courseSet;

   @OneToOne(mappedBy = "education",fetch = FetchType.LAZY, orphanRemoval = true)
    private Student student;

    @OneToOne(mappedBy = "educationT",fetch = FetchType.LAZY)
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

    /*public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }*/

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Education education = (Education) o;
        return educationId == education.educationId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(educationId);
    }
}
