package basic.list;

import java.util.Stack;

public class Application2 {
    public static void main(String[] args) {
        /*
        * Stack
        * 선형 메모리 공간에 데이터를 저장하며 후입 선출(LIFO) 방식의 자료구조
        * */

        Stack<Integer> integerStack = new Stack<>();
        // stack에서는 add가 아니라 push 권장됨
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println(integerStack);

        // search(): 요소를 찾을 때
        // 인덱스가 아닌 위에서부터의 순번을 의미 (1번부터 시작)
        System.out.println("integerStack.search(5) :" + integerStack.search(5)); // 1 출력됨

        // peek(): 가장 상단에 (마지막에) 있는 요소 반환
        // pop(): 가장 상단에 (마지막에) 있는 요소 반환 후 제거
        System.out.println("peek() :" + integerStack.peek());
        System.out.println(integerStack);

        System.out.println("pop() :" + integerStack.pop());
        System.out.println(integerStack);
    }
}
