package com.spring.core.chap02_2.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

// 스프링에게 관리할 객체를 알려주는 클래스
@Configuration
public class LibraryConfig {

    // 스프링아 나 대신 책 좀 만들어라
    @Bean
    public Book book1() {
        return new Book("클린코드");
    }

    @Bean
    public Book book2() {
        return new Book("이펙티브 자바");
    }

    @Bean
    public Library library(List<Book> books) {
        return new Library(books);// 생성자 주입
    }

}
