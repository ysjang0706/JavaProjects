package Chapter05;

import java.util.Calendar;
import java.util.Scanner;

public class LAB_Chapter05_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("============== PC방 출입시간 제한 ==============");

        System.out.print("*  출생년도 입력(4자리 정수) : ");
        int birthYear = sc.nextInt();

        Calendar calendar = Calendar.getInstance();
        int nowYear = calendar.get(Calendar.YEAR);
        int age = nowYear - birthYear;
        String str;

        if (age >= 18) str = "즐거운 시간 보내세요~!" ;
        else str = "집에 가실 시간입니다~!" ;

        System.out.printf("귀하의 나이는 만%d세 이므로 %s\n",age,str);
        System.out.println("협조해주셔서 감사합니다~!");


        sc.close();
    }
}
