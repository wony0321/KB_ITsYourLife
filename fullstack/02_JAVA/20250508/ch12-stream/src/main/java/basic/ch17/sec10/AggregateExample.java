package basic.ch17.sec10;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class AggregateExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // 2의 배수 카운팅
        long cnt = Arrays.stream(arr).filter(i -> i % 2 == 0).count();
        System.out.println(cnt);

        // 2의 배수 총합
        int sum = Arrays.stream(arr).filter(i -> i % 2 == 0).sum();
        System.out.println(sum);

        // 2의 배수 평균
        OptionalDouble avg = Arrays.stream(arr).filter(i -> i % 2 == 0).average();
        System.out.println(avg.getAsDouble());

        // 2의 배수 중 최대값
        OptionalInt max = Arrays.stream(arr).filter(i -> i % 2 == 0).max();
        System.out.println(max.getAsInt());

        // 2의 배수 중 최소값
        OptionalInt min = Arrays.stream(arr).filter(i -> i % 2 == 0).min();
        System.out.println(min.getAsInt());

        // 첫 번째 3의배수
        OptionalInt ans = Arrays.stream(arr).filter(i -> i % 3 == 0).findFirst();
        System.out.println(ans.getAsInt());
    }
}
