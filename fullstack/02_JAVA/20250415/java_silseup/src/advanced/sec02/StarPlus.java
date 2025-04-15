package advanced.sec02;

public class StarPlus {
    public static void main(String[] args) {

        int starCount = 1;

        while (starCount <= 5) {
            for (int i = 0; i < starCount; i++) {
                System.out.print("*");
            }
            System.out.println();
            starCount++;
        }
    }
}
