package basic.ch01.sec011;

public class Type {
    public static void main(String[] args) {
        
        // 변수 사용 방법
        // 1. 변수 선언
            // 선언
            // 자료형 변수명;
            // 자료형이란 다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지
            // 미리 Compiler와 약속하는 키워드
            /*
            *   // 정수형
            *   // 1 byte = 8bit
            *   //
                byte bnum; // 1byte
                short snum; // 2byte
                int inum; // 4byte // 대표 자료형
                long lnum; // 8byte

                // 실수형
                float fnum; // 4byte
                double dnum; // 8byte // 대표 자료형

                // 문자형
                char ch; // 2byte

                // 논리형
                boolean isTrue; // 1byte
            *
            * */
        // 2. 변수 초기화
            // 초기화
        // 3. 변수 쓰기


        int hour = 3;
        int minute = 5;
        System.out.println(hour + "시간 " + minute + "분");

        int totalMinute = hour * 60 + minute;
        
        System.out.println("총 " + totalMinute + "분");
    }
}
