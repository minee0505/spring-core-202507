package com.spring.core.chap02_2.practice2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 스프링에게 관리할 객체를 알려주는 클래스
@Configuration
public class MusicPlayerConfig {

    // 스프링아 나 대신 스피커 좀 만들어라
    @Bean
    public Speaker speaker() {
        return new Speaker();
    }

    // 스프링아 나 대신 뮤직플레이어 좀 만들어 대신 그 때 스피커를 결합햅
    @Bean
    public MusicPlayer musicPlayer() {
        MusicPlayer player = new MusicPlayer();
        player.setSpeaker(speaker());
        return player;
    }

}
