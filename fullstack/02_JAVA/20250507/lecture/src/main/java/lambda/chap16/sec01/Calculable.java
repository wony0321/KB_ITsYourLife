package lambda.chap16.sec01;

/*
* 함수형 인터페이스
* - 단 하나의 추상 메서드만 가지는 인터페이스
* */
@FunctionalInterface
public interface Calculable {
    // 추상메서드
    void calculate(int x, int y);
//    void calculate2(int x, int y);

    // 두개 하면 익명함수 사용시 어떤 메서드 사용할지 모르기 때문에 무조건 하나만!
}
