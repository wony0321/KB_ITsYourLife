package date;

import java.util.Calendar;
import java.util.Date;

public class Application1 {
    public static void main(String[] args) {

        Date legacyDate = new Date();
        legacyDate.setYear(2025);
        System.out.println("Date setYear(2025) -> 실제출력 : " + legacyDate);

        // Calendar 0월부터 시작
        Calendar cal = Calendar.getInstance();
        cal.set(2025,4,24);
        System.out.println("Calendar.set(2025.3.23) -> 실제 월 : " + cal.getTime());
    }
}