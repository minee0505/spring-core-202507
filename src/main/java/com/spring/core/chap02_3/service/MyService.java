package com.spring.core.chap02_3.service;

import com.spring.core.chap02_3.repository.MyRepository;
import org.springframework.stereotype.Service;

// 데이터베이스에서 가져온 데이터를 정제하는 클래스
//@Component
@Service // 비즈니스 로직을 담고 있는 서비스 클래스에 사용
public class MyService {

    // 데이터베이스에 데이터를 가져오기 위해 의존관계
    public MyRepository repository;

//    @Autowired
    public MyService(MyRepository repository) {
        System.out.println("MyService객체 생성!");
        this.repository = repository;
        System.out.println("Repository 의존성이 service에 주입됨!");
    }

    public String processData() {
        return "데이터를 정제해서 전처리 -> " + repository.findData().getData();
    }
}
