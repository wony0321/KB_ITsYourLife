package lecture.intermediate;

import java.util.stream.IntStream;

public class Application1 {
    public static void main(String[] args) {
        /*
        * Filter : 스트림에서 특정 데이터만 걸러내는 메소드
        * Predicate를 매개변수로 받음
        * */

        IntStream intStream = IntStream.range(0, 10);

        intStream.filter(i -> (i % 2) == 0)
                .forEach(i -> System.out.print(i + " "));

    }
}
