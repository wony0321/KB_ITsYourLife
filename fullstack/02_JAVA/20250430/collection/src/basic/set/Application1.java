package basic.set;

import java.util.HashSet;
import java.util.Set;

public class Application1 {
    public static void main(String[] args) {
        /*
        * Set 인터페이스 구현
        * - 요소의 저장 순서를 유지하지 않음
        * - 같은 요소의 중복 저장을 허용하지 않음 (null값도 중복 X)
        * */

        HashSet<String> hashSet = new HashSet<>();
        Set<String> set = new HashSet<>();

        hashSet.add("java");
        hashSet.add("mysql");
        hashSet.add("jdbc");
        hashSet.add("html");
        hashSet.add("css");

        // 저장 순서 유지 X
        System.out.println("hashSet: " + hashSet);
        System.out.println("hashSet: " + hashSet);

        // 중복 허용 X
        hashSet.add("java");
        System.out.println("hashSet: " + hashSet);
        System.out.println("저장된 객체 수 : " + hashSet.size());

        System.out.println("포함확인 : " + hashSet.contains("oracle"));
        System.out.println("포함확인 : " + hashSet.contains("java"));

        // 향상된 for문
        for (String string : hashSet) {
            System.out.println(string);
        }

        // toArray() : 배열로 바꾸고 for문 사용 가능
        Object[] arr = hashSet.toArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " : " + arr[i]);
        }

        Boolean result = hashSet.remove("java");
        System.out.println("result: " + result);
        System.out.println("hashSet: " + hashSet);

        hashSet.clear();
        System.out.println("hashSet: " + hashSet);
        System.out.println("hashSet isEmpty? " + hashSet.isEmpty());
    }
}
