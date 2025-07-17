package com.spring.core.chap02_2.practice2;

public class MusicPlayer {

    private Speaker speaker;

    // setter 주입 - setter를 통해 의존객체를 전달받아 결합
    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public void playMusic() {

        if (speaker == null) {
            System.out.println("스피커가 세팅되지 않았습니다.");
            return;
        }

        speaker.playSound();
        System.out.println("음악이 재생됩니다.");
    }

}
