package ch07.sec10.lecture;

public abstract class Product {

    // 필드 선언 가능
    private int nonStaticField;
    private static int staticField;

    // 생성자도 가질 수는 있음
    public Product() {
    }

    // 모든 상속 받는 메소드들이 이걸 구현해야 한다는 것!
    public abstract void abstMethod();

    public void nonStaticMethod() {
        System.out.println("추상클래스안의 nonStaticMethod() 호출됨!");
    }

    public static void staticMethod() {
        System.out.println("추상클래스안의 staticMethod() 호출됨!");
    }
}