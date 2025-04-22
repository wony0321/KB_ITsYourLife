package ch07.sec07.exam01;

public class childExample {
    public static void main(String[] args) {
        // 자식 타입 객체 생성
        Child child = new Child();

        // 부모 타입 -> 자식을 업캐스팅
        Parent parent = child;
        parent.method1(); // Parent-method1()
        parent.method2(); // Child-method2()
    }
}
