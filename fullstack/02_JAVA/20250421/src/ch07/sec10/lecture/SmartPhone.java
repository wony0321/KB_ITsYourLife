package ch07.sec10.lecture;

public class SmartPhone extends Product {
    // 추상 메서드 구현 전에는 빨간줄 나옴
    @Override
    public void abstMethod() {
        System.out.println("Product 클래스의 abstMethod 오버라이딩한 메소드 호출 ..!");
    }

}
