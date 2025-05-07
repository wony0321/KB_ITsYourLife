package lambda.chap16.sec04;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action((x, y) -> {
            System.out.println("x: " + x + ", y: " + y);
            return x + y;
        });

//        person.action((x, y) -> sum(x, y));

        /*
        * 메소드 참조
        * 함수형 인터페이스를 람다식으로 쓰는게 아닌, 일반 메소드를 참조시켜 선언하는 방법
        * 일반 메소드를 참조하기 위한 조건
        * 각 메소드의 매개변수 타입/개수/반환형이 같아야함
        * 
        * 클래스이름::메소드이름
        * */
        person.action(LambdaExample::sum);
    }

    // 구현된 일반 메소드를 가지고와서 사용
    public static double sum(double x, double y) {
        return (x + y);
    }
}
