package lecture.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println(map.size());

        Set<String> KeySet = map.keySet();
        System.out.println(KeySet); //[A, B, C]

        // 해쉬맵에 들어가는 key와 value의 값을 엔트리라고 함
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        System.out.println(entrySet); //[A=1, B=2, C=3]

        Iterator<String> KeyIterator = map.keySet().iterator();
        while (KeyIterator.hasNext()) {
            String k = KeyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + " " + v);
        }

        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);
        }
        System.out.println();

        //키로 엔트리 삭제
        map.remove("A");

        System.out.println(map);
    }
}
