package ch07.sec04.exam02;

public class Computer extends Calculator{

    // 다른 생성자가 만들어있을때는 기본적 생성자 만들어주지 않음
//    public Computer() {
//        super();
//    }

//    public Computer(int a) {
//
//    }

    @Override
    public double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
