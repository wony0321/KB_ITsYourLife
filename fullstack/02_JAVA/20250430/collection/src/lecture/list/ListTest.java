package lecture.list;

import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("Hello");
        list.add(100);
        list.add(11.2);
        list.add(true);

        System.out.println(list);

        list.add(0,"김길동");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        list.set(0, "정길동");
        System.out.println(list);

        int index = list.indexOf("Hello");
        System.out.println(index);

        boolean result = list.contains("Hello");
        System.out.println(result);
    }
}
