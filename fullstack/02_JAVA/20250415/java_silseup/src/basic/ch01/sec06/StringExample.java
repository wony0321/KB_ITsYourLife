package basic.ch01.sec06;

public class StringExample {
    public static void main(String[] args) {

        // 이스케이프 문
        // 따옴표를 출력하려면?

        
        // \": 큰 따옴표 표시
        // \': 작은 따옴표 표시
        String name = "홍길동";
        System.out.println(name);
        String job = "프로그래머";
        System.out.println(job);
        String str = "나는 \"자바\"를 배웁니다.";
        System.out.println(str);

        // \t: 탭
        str = "번호 \t 이름 \t 직업";
        System.out.println(str);

        // \n: 줄바꿈
        str = "나는\n자바를\n배웁니다.";
        System.out.println(str);

    }
}
