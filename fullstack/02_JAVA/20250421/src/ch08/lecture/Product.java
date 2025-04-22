package ch08.lecture;

public class Product implements InterProduct {
    @Override
    public void nonStaticMethod() {
        System.out.println("InterProduct의 nonStaticMethod 오버라이딩한 메서드 호출!");
    }

    @Override
    public void abstMethod() {
        System.out.println("InterProduct의 추상메서드 오버라이딩한 메서드 호출!");
    }

    // default 제외하고 오버라이딩 가능!
    @Override
    public void defaultMethod() {
        System.out.println("InterProduct의 default Method 오버라이딩한 메소드 호출");
    }
}
