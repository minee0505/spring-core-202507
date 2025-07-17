package com.spring.core.chap02_2.practice;

import com.spring.core.chap02_2.config.CarConfig;
import com.spring.core.chap02_2.vehicle.Car;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void test1() {

        // 스프링은 등록된 모든 객체를 Bean 이라는 개념으로 관리하며
        // 객체의 생성과 소멸까지의 모든 생애주기를 스프링이 통합관리 운영함.
        // 운영하는 커다란 창고 ApplicationContext 라고 부름

        ApplicationContext context = new AnnotationConfigApplicationContext(LibraryConfig.class);

        Library library = context.getBean(Library.class);
        library.listBooks();
    }
}