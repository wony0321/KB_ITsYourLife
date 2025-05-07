package basic.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Application1 {
    public static void main(String[] args) {
        Map<Object, Object> map = new HashMap<>();
        /*
        * Map
        * -> Collection 인터페이스들과는 다른 저장방식
        * key, value 쌍으로 저장하는 방식
        *
        * key 란?
        * - 값을 찾기 위한 이름 역할의 객체
        * - 키는 중복을 허용하지 않음, 키가 다르면 중복되는 값은 저장 가능
        *
        * */

        HashMap<Object, Object> hashMap = new HashMap<>();

        hashMap.put("one", "red apple");
        hashMap.put(1, "red apple");
        hashMap.put(12, 33);
        // value값은 같아도 됨
        hashMap.put(13, 33);

        System.out.println("hashMap :" + hashMap);

        // 삭제
        hashMap.remove("one");
        System.out.println("hashMap :" + hashMap);
        
        // getOrDefault(key, DefaultValue)
        // 지정한 키가 맵에 없을때 기본값 반환, 있을 때는 해당키의 value 반환
        System.out.println("getOrDefault 테스트: " + hashMap.getOrDefault(1, "기본값"));
        System.out.println("getOrDefault 테스트: " + hashMap.getOrDefault("one", "기본값"));

        // Iterator로 key value 출력
        System.out.println("================== Set을 이용해 Iterator로 변환 ==================");

        // keySet() : map에 저장된 모든 key를 Set 형태로 반환
        Set<Object> keys = hashMap.keySet();

        // iterator() : iterator 객체 반환
        Iterator<Object> keyIter = keys.iterator();

        while (keyIter.hasNext()) {
            Object key = keyIter.next();

            // key 값으로 value 꺼냄
            Object value = hashMap.get(key);
            System.out.println("key: " + key + " value: " + value);
        }

        for (Object key : keys) {
            Object value = hashMap.get(key);
            System.out.println("key: " + key + " value: " + value);
        }

        System.out.println("=============== Map 내부의 EntrySet 이용 =====================");
        // entrySet() : Map에 저장된 key와 value 쌍을 Set 형태로 "뷰"로 반환
        // -> 이때 반환된 Set은 Map이랑 연결되어 있어서 추가수정삭제를 하면 원본에도 반영
        // Set<Map.Entry<K, V>> set = map.entrySet();

        Set<Map.Entry<Object, Object>> entrySet = hashMap.entrySet();

        Iterator<Map.Entry<Object, Object>> entryIter = entrySet.iterator();

        while (entryIter.hasNext()) {
            Map.Entry<Object, Object> entry = entryIter.next();
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
    }
}
