package com.example;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;


class StudentTeacherTest {

    private static final String STUDENT_UUID_A = "student-uuid-a";
    private static final String STUDENT_UUID_B = "student-uuid-b";
    private static final String TEACHER_UUID_A = "teacher-uuid-a";
    private static final String TEACHER_UUID_B = "teacher-uuid-b";

    @Test
    void testEquals() {
        // given
        final var studentA = new Student();
        studentA.setUuid(STUDENT_UUID_A);

        final var studentB = new Student();
        studentB.setUuid(STUDENT_UUID_B);

        final var teacherA = new Teacher();
        teacherA.setUuid(TEACHER_UUID_A);

        final var teacherB = new Teacher();
        teacherB.setUuid(TEACHER_UUID_B);

        // when
        EqualsVerifier.forClass(StudentTeacher.class)
                .withPrefabValues(Student.class, studentA, studentB)
                .withPrefabValues(Teacher.class, teacherA, teacherB)
                .suppress(Warning.SURROGATE_KEY)
                .usingGetClass()
                .verify();
    }
}