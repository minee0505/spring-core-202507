package com.spring.core.chap02_4.controller;

import com.spring.core.chap02_4.model.Student;
import com.spring.core.chap02_4.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import java.util.List;

// 학생 조회 요청, 생성 요청을 처리
@Controller
public class StudentController {

    // 지금 이렇게만 하면 레포지토리는 인터페이스 껍데기여서 포이치 안돌아감
    // 구현 클래스 만들어줘야 함
    private StudentRepository repository;

    // @Qualifier = 때로는 같은 타입의 여러 빈이 존재할 때, 어떤 빈을 주입할지 명시적으로 지정해야 할 필요가 있다.
    // 특정 빈을 지정할 수 있고, 캐멀케이스 사용함
    // 특정 빈 이름이 너무 길면 수정해서 ex) @Repository("sdr") 넣으면 됨
//    public StudentController(@Qualifier("studentMemoryRepository") StudentRepository repository) {
    public StudentController(@Qualifier("sdr") StudentRepository repository) {
        this.repository = repository;
    }

    // 조회 요청을 처리
    public void showStudents() {
        List<Student> studentList = repository.findAll();
        System.out.println("------학생 목록 출력------");
        studentList.forEach(System.out::println);
    }
}
