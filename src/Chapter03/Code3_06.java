package Chapter03;

import java.util.Scanner;

public class Code3_06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = s.nextInt();
        System.out.print("Enter num1 : ");
        int num2 = s.nextInt();
        double result = Math.pow(num1, num2);
        System.out.printf("%d의 %d 제곱은 %.0f입니다.", num1, num2, result);
        s.close();
    }
}
