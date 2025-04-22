package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {

        // 업캐스팅 (Child 객체를 Parent 타입으로 참조)
        Parent parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();
//        parent.field1 = "data2";
//        parent.method3(); // 이 부분에서 문제 발생
//        Child child = new Child();


        // 자식 타입으로 강제 형변환 (다운캐스팅)
        Child child = (Child) parent;

        child.field2 = "data3";
        child.method3();
    }
}
