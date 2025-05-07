package lecture.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
    public static void main(String[] args) {
        String s = "bbbaaacdddefecge";
        // a b c d e f g 출력해야함
        // s에 들어있는 문자를 하나씩 꺼내서 hashset에 넣는다
        // 중복제거됨
        HashSet<String> set = new HashSet<String>();

        String[] s2 = s.split("");
        // { "b", "b", "b", "a", "a", ~~~ }
        // 배열로 정렬 먼저 하면 편할 것 같음
        Arrays.sort(s2);

        for (String x:s2) {
            set.add(x); // 중복되는 것은 넣지 않음
        }

        System.out.println(set); // 참조형 변수 프린트 --> 패키지.클래스명@해시코드
        // @toString() 메서드가 재정의 --> set에 있는 목록을 문자열로 만들어주는 것으로 오버라이딩


        // set을 하나씩 꺼낼 때 사용하는 방법 2가지
        // for-each 문 (반복자가 만들어져서 동작하는 개념)
        for (String x2:set) {
            System.out.println(x2 + " ");
        }
        System.out.println("------------");

        // 반복자를 외부에 만들어주자.
        Iterator<String> iterator = set.iterator();
        // 먼저 있는지 없는지 체크한 다음, 있으면 하나씩 꺼내오는 방식
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
