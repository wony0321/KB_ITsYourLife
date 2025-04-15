package basic.ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = 0;

        while (true) {
            System.out.println("----------------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("----------------------------------");
            System.out.print("선택: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                speed++;
                System.out.println("현재 속도 = " + speed);
            } else if (choice == 2) {
                if (speed > 0) speed--;
                System.out.println("현재 속도 = " + speed);
            } else if (choice == 3) {
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("올바른 번호를 선택하세요.");
            }
        }

        sc.close();

    }
}
