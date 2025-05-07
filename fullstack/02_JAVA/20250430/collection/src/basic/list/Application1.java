package basic.list;

import java.time.LocalDateTime;
import java.util.*;

public class Application1 {
    public static void main(String[] args) {

        /*
         * 컬렉션 프레임워크는 크게 3가지 인터페이스 중 한 가지를 상속받아 구현함
         * List 인터페이스
         * - 순서가 있음, 중복 저장 허용
         * - Vector, ArrayList, LinkedList, Stack, Queue
         *
         * Set 인터페이스
         * - 순서가 없음, 중복 불가
         * - HashSet, TreeSet
         *
         * Map 인터페이스
         * - Key-Value 값이 한 쌍으로 이루어진 데이터 집합 (순서 X, 중복된 키 불가)
         * - HashMap, TreeMap, HashTable, Properties
         * */

        // 가변적이고 요소의 추가 수정 삭제를 메서드로 제공해줌
        ArrayList<Object> alist = new ArrayList<>();
        List<Object> list = new ArrayList<>();

        list.add("apple");
        list.add(123);
        list.add(45.67);
        list.add(LocalDateTime.now());

        System.out.println(list); // toString() 오버라이딩 되어 있음

        System.out.println("list의 크기 : " + list.size());

        list.add(1, "banana");
        System.out.println(list);

        list.set(1, true);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        /*
         * LinkedList
         * - 저장한 요소가 순서를 유지하지 않고 저장됨
         * - 요소들 사이를 링크로 연결하여 구성해 마치 연결된 리스트처럼 만듦
         * - 요소의 저장과 삭제가 빈번히 일어날 때 성능면에서 ArrayList보다 우수
         * */
        List<String> strList = new LinkedList<>();

        strList.add("c");
        strList.add("d");
        strList.add("a");
        strList.add("d");
        System.out.println(strList);

        Collections.sort(strList);
        System.out.println(strList);
        Collections.reverse(strList);
        System.out.println(strList);

        /*
         * Iterator (반복자)
         * -> Collection 인터페이스의 iterator() 메서드를 이용해서 생성 가능
         * -> 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용
         * */

        Iterator<String> iterator = strList.iterator(); // Iterator 객체 생

        /*
         * hasNext() : 다음 요소가 남아있으면 true, 없으면 false
         * next() : 커서를 다음 요소로 이동시키고 그 요소를 반환
         * */
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}