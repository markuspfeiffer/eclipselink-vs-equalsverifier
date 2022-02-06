package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "student_teacher")
@IdClass(StudentTeacherId.class)
public class StudentTeacher {

    private Student student;
    private Teacher teacher;
    private int index;

    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "student_uuid", referencedColumnName = "uuid", nullable = false, updatable = false)
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "teacher_uuid", referencedColumnName = "uuid", nullable = false, updatable = false)
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Column(name = "index", nullable = false, updatable = false)
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final StudentTeacher that = (StudentTeacher) o;
        return Objects.equals(student, that.student) && Objects.equals(teacher, that.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, teacher);
    }
}
