package lecture.intermediate;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Application2 {
    /*
    * map : 스트림에 들어있는 데이터를 특정 람다식을 통해 각각의 데이터를 가공하고 새로운 스트림에 담아준다.
    * sorted(Comparator<>())
    * 스트림에 담긴 데이터들을 정렬해서 반환
    *
    * */

    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 10);

        intStream.filter(i -> i % 2 == 0)
                .map(i -> i * 5) // 각 5를 곱해서 새로운 스트림에 담음
                .forEach(i -> System.out.print(i + " "));

        List<Integer> integerList = IntStream.of(5, 10, 99, 2, 4, 6)
                .boxed() // 각 정수를 Integer형태로 변환
//                .sorted()
                .sorted(Comparator.reverseOrder()) // 역순 정렬
                .toList(); // 리스트로 변환

        System.out.println("IntegerList : "  + integerList);

    }
}
