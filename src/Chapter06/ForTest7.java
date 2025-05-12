package Chapter06;

public class ForTest7 {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%d x %d = %d\n", j, i, i * j);
            }

        }
    }
}
