package Chapter03;

import java.util.Scanner;

public class Code3Lab01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double lb = 0.453592;
        double kg = 2.204623;
        System.out.print("파운드(lb)를 입력하세요 : ");
        int num1 = s.nextInt();
        System.out.printf("%d파운드(lb) = %f kg입니다.\n", num1, num1 * kg/lb);
        System.out.print("킬로그램(kg)를 입력하세요 : ");
        int num2 = s.nextInt();
        System.out.printf("%dkg = %f 파운드(lb)입니다.", num2, num2 * kg);
        s.close();
    }
}
