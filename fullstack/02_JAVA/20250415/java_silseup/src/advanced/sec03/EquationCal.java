package advanced.sec03;

public class EquationCal {
    public static void main(String[] args) {

//        for (int x = 0; x <= 10; x++) {
//            for (int y = 0; y <= 10; y++) {
//                if ((4 * x + 5 * y) == 60) {
//                    System.out.println("(" + x + "," + y + ")");
//                }
//            }
//        }

        for (int x = 1; x <= 10; x++) {
            int remainder = 60 - 4 * x;

            if (remainder % 5 == 0) {
                int y = remainder / 5;
                if (y >= 1 && y <= 10) {
                    System.out.println("(" + x + ", " + y + ")");
                }
            }
        }
    }
}
