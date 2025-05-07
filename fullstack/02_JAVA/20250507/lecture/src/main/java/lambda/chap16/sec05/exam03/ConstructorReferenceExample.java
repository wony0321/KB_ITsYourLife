package lambda.chap16.sec05.exam03;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();

        Member m1 = new Member("winter");
        System.out.println(m1);
        System.out.println();

        Member m2 = new Member("winter", "한겨울");
        System.out.println(m2);
        System.out.println();
    }
}
