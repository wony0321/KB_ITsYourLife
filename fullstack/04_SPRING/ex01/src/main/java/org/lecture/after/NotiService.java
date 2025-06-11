package org.lecture.before;

public class NotiService {

    // 결합도 강한 코드..
//    private EmailSender emailSender = new EmailSender();

    private SMSSender sender = new SMSSender();

    /*
    * 문제점
    * 1. 기존 클래스를 직접 열고 수정해야함.
    * 2. NotiService의 내부 코드가 변경이 일어난다.
    *
    * */

    public void send(String message) {
        sender.send(message);
    }

//    public void notify(String message) {
//        emailSender.send(message);
//    }
}
