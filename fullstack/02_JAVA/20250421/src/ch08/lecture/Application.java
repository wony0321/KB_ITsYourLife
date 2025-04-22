package ch08.lecture;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        /*
        * 인터페이스
        * -> 자바의 클래스와 유사하지만, 추상메서드와 상수 필드만 가질 수 있는 클래스의 변형체
        *
        * 사용 목적
        * - 추사클래스와 비슷하게 필요한 기능을 공통화해서 강제성을 부여하기 위해
        * - 클래스 상속의 단일상속이라는 단점 극복
        *
        * */

        // 인터페이스는 인스턴스를 생성할 수 없고, 생성자가 존재하지 않음
        // InterProduct interProduct = new InterProduct() { }

        // Product 클래스의 인스턴스를 만들고, 그걸 같은 타입인 Product 변수에 담는 것.
        Product product = new Product();

        // 다형성(polymorphism)
        // 인터페이스 타입으로 구현체(Product)의 객체를 참조하는 것
        // 부모 타입으로 선언하고 자식 넣어줌
        InterProduct interProduct = new Product();

        // 동적 바인딩
        interProduct.abstMethod();
        interProduct.nonStaticMethod();

        interProduct.defaultMethod();

        // static의 경로: 정적 메서드 호출 방법
        InterProduct.staticMethod();

        System.out.println(InterProduct.MAX_NUM);
        System.out.println(InterProduct.MIN_NUM);

        List list = new ArrayList();

    }
}
