package com.spring.core.chap02_2.practice;

import java.util.List;

public class Library {

    // 의존 객체 설정
    private final List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public void listBooks() {
        System.out.println("도서관 책 목록입니다:");

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
