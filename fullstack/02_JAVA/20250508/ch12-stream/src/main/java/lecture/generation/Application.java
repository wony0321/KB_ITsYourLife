package lecture.generation;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        /*
        * Wrapper 클래스 자료형의 스트림으로 변환이 필요할 때 boxing
        *
        * DoubleStream -> Stream<Double> 형태로 변경
        * Random().doubles(num) : num 크기의 DoubleStream을 반환해준다.
        * boxed() : 기본 타입 스트림인 XXXStream을 박싱하여 Wrapper 타입의 Stream<XXX>으로 반환한다.
        *
        * */

        // boxed()로 DoubleStream -> Stream<Double>
        Stream<Double> doubleStream = new Random().doubles(5).boxed();

        // .chars()로 문자열을 intStream으로 변환
        IntStream intChars = "hello World".chars();
        intChars.forEach(v -> System.out.print(v + " "));


    }
}
