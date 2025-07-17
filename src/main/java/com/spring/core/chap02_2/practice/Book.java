package com.spring.core.chap02_2.practice;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private final List<String> titles = new ArrayList<>();

    public Book(String titles) {
            this.titles.add(titles);
    }

    @Override
    public String toString() {
        return "Book{" + "titles=" + titles + '}';
    }

}
