package ch14.sec03.exam02;

import java.awt.*;

public class BeepPrintExample2 {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run()   {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for ( int i = 0; i < 5; i++) {
                toolkit.beep();

                try {
                    Thread.sleep(500);
                } catch (Exception e ) {
                    // 예외가 발생한 위치 경로를 알려줌 (콘솔에 출력)
                    e.printStackTrace();
                }
            }
            }
        });
        thread.start();
        for(int i = 0; i < 5; i++) {
            System.out.println("띵");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
