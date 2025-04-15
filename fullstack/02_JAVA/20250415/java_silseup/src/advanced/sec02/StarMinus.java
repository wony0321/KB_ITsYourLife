package advanced.sec02;

public class StarMinus {
    public static void main(String[] args) {

        int starCount = 5;

        while (starCount > 0) {
            for (int i = 0; i < starCount; i++) {
                System.out.print("*");
            }
            System.out.println();
            starCount--;
        }
    }
}
