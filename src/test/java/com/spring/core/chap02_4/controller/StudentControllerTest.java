package com.spring.core.chap02_4.controller;

import com.spring.core.chap02_4.config.StudentConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class StudentControllerTest {

    @Test
    void test() {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(StudentConfig.class);

        StudentController controller1 = context.getBean(StudentController.class);

        controller1.showStudents();
    }

}