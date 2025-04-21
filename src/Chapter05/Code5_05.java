package Chapter05;

import java.util.Scanner;

public class Code5_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("+++++++++++++++ 홀수/짝수 구분 프로그램 +++++++++++++++");

        System.out.print("* 정수만 입력 : ");
        int number = sc.nextInt();
        String resultStr = "";
        sc.close();
        if (number % 2 == 0) {
            resultStr = "짝수";
        }
        else{
            resultStr = "홀수";
        }

        System.out.printf("### 결과 : %d(은)는 %s입니다.", number, resultStr);
    }

}
