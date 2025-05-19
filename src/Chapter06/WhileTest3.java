package Chapter06;

import java.util.Scanner;

public class WhileTest3 {
    public static void main(String[] args) {
        int num1,num2 = 0;
        int sum = 0;
        Scanner s1 = new Scanner(System.in);
        while(true) {
            System.out.print("정수 1 입력 ==> ");
            num1 = s1.nextInt();
            if(num1 == 0) break;
            System.out.print("정수 2 입력 ==> ");
            num2 = s1.nextInt();
            sum = num1 + num2;
            System.out.printf("%d + %d = %d\n", num1, num2, sum);
        }
        System.out.println("프로그램 종료");
    }
}
