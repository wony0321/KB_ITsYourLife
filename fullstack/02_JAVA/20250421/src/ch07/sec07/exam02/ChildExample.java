package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;

        parent.method1(); // Parent의 method1() 호출
        parent.method2(); // Child에서 오버라이딩한 method2() 호출!
//        parent.method3();
        //parent의 참조 타입이 Parent이기 때문에,
        //Parent 클래스에 정의되지 않은 method3()에는 접근할 수 없음
        //자식 객체를 가리키고 있어도 참조 변수 타입이 Parent이면,
        //Parent에 선언된 메서드까지만 접근 가능

        // 수정: 다운캐스팅 후 호출
        ((Child) parent).method3();
    }
}
