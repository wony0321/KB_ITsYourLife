package lecture.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        String[] all = {"홍길동", "김길동", "정길동"};

        Map<String, Integer> map = new HashMap<>();
        // 키 + 값의 쌍으로 넣어야 함(Entry, 엔트리)
        map.put("김길동", 95);
        System.out.println(map);
        map.put("홍길동", 85);
        System.out.println(map);

        // 값을 하나씩 꺼내는 방법
        // 방법1 ) 키목록을 가지고 값을 꺼내는 방법
        // 1-1. 키 목록을 구해야 한다.
        Set<String> keys = map.keySet();
        System.out.println(keys);

        for (String key : all) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
    }
}
