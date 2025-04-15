package basic.ch04.sec04;

public class MultiplicationTableExample {
    public static void main(String[] args) {

        int num = 2;
        while (num <= 9) {

        System.out.println("*** " + num + "단" + " ***");

        for (int i = 1; i <= 9; i++) {
            System.out.println(num + "*" + i + "=" + num * i);
        }
        num++;
        }
    }
}
