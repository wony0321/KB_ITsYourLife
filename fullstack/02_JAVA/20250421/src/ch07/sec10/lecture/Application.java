package ch07.sec10.lecture;

public class Application {
    public static void main(String[] args) {
        /*
        * 추상클래스
        * - 추상 메소드를 0개 이상 포함하는 클래스
        * - abstract 키워드를 사용해서 선언
        * - 직접 인스턴스를 생성 불가 (new로 객체 생성 불가)
        * - 하위 클래스가 상속받아 구현해야 사용 가능
        * -> 다형성을 활용할 수 있다.
        *
        * 추상메서드
        * - 메소드 선언부만 있고 구현부는 없는 메소드
        * - 반드시 abstract 키워드를 붙여야 함
        * - ex) public abstract void method();
        * -> 하위(자식) 클래스는 반드시 오버라이딩 해야한다.
        *
        * */

        // Product product = new Product(); // 추상클래스는 인스턴스 생성 불가


        SmartPhone smartPhone = new SmartPhone();
        smartPhone.abstMethod();

        // instance of: 특정 클래스나 인터페이스의 인스턴스인지 여부를 검사하는데 사용되는 연산자
        System.out.println(smartPhone instanceof SmartPhone);
        System.out.println(smartPhone instanceof Product);


        Product product = new SmartPhone();
        // 동적 바인딩: Product의 메소드가 아닌 SmartPhone에서 가지고옴
        product.abstMethod();
        Product.staticMethod();
        product.nonStaticMethod();

        // 상속은 내가 진짜 그 클래스를 전체적으로 가져와서
        // '확장'해서 쓰고 싶을 때 사용함. → is-a 관계

        // 예: class Dog extends Animal
        // Dog는 Animal이다 (is-a)

        // 인터페이스는 "이 객체는 이런 기능을 할 수 있어" 라는 역할을 정해주는 느낌
        // 즉, 구멍만 뚫어놓고 "너가 이 메서드들을 채워서 구현해라!" 라는 의미임

        // implements는 "이 인터페이스의 구현체가 되겠다"는 뜻이고,
        // 추상 메서드들을 반드시 구현해야 함
    }
}
