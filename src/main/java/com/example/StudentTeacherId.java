package com.example;

import java.io.Serializable;
import java.util.Objects;

public class StudentTeacherId implements Serializable {

    private String student;
    private String teacher;

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final StudentTeacherId that = (StudentTeacherId) o;
        return Objects.equals(student, that.student) && Objects.equals(teacher, that.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, teacher);
    }
}
