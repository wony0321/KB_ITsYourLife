package basic.ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Scanner라는 클래스
        // 현실 세계에 있는 클래스를 갖고 와서 쓰려다 보니
        // 다 숫자로 관리할 수 없기 때문에 객체에 저장

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("x 값 입력 : ");
            String str = sc.nextLine();

            if (str.equals("q")) {
                break;
            }
    
            System.out.println("입력값 : " + str);
        }

        // 스캐너 닫기
        System.out.println("종료");
        sc.close();
    }
}
