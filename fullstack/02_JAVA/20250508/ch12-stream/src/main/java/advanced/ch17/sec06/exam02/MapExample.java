package advanced.ch17.sec06.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};

        IntStream stream1 = Arrays.stream(intArray);
        stream1
                .asDoubleStream()
                .forEach(i -> System.out.println(i));

        System.out.println();

        IntStream stream2 = Arrays.stream(intArray);
        stream2
                .forEach(i -> System.out.println(i));
    }
}
