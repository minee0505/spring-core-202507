package com.spring.core.chap01;

public class AsianRestaurant implements Chef{

    //전문 쉐프
    private Chef mainChef;

    // 코스 메뉴
    private Course course;

    public AsianRestaurant(Chef chef, Course course) {
        this.mainChef = chef;
        this.course = course;
    }

    @Override
    public void cook() {
        System.out.println("아시안 요리를 주문합니다.");
        course.combineMenu();
        mainChef.cook();
    }
}
