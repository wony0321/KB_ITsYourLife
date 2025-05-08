package basic.ch17.sec05;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("신용권");
        list.add("감자바");
        list.add("신용권");
        list.add("신민철");
        list.add("신용권");
        list.add("신용권");
        list.add("신민철");

        //중복 요소 제거
        list.stream()
                .distinct() // 중복 제거
                .forEach(name -> System.out.println(name));

        System.out.println();

        //신으로 시작하는 요소만 필터링
        list.stream()
                // startsWith : 문자열이 특정 접두사로 시작하는지 여부 판단
                .filter(name -> name.startsWith("신"))
                .forEach(name -> System.out.println(name));

        System.out.println();

        // 중복 요소를 먼저 제거하고, 신으로 시작하는 요소만 필터링
        list.stream()
                .distinct()
                .filter(name -> name.startsWith("신"))
                .forEach(name -> System.out.println(name));
    }
}
