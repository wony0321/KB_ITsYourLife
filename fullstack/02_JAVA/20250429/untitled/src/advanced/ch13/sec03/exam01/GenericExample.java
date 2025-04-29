package advanced.ch13.sec03.exam01;

public class GenericExample {
    // boxing 제네릭 메서드 정의
    // 이 메서드 안에서 T라는 타입 변수를 사용하겠다는 의미
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }

    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100);
        int intValue = box1.get();
        System.out.println(intValue);
        Box<String> box2 = boxing("홍길동");
        String strValue = box2.get();
        System.out.println(strValue);
    }


}
