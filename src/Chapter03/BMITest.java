package Chapter03;

import java.util.Scanner;

public class BMITest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("체중(kg) : ");
        double kg = sc.nextDouble();
        System.out.print("키(cm) : ");
        double m = sc.nextDouble()/100;
        System.out.printf("결과 : 당신은 몸무게 %.1f(kg), 키 %.1f(cm)이므로, BMI지수는 %f(kg/m2)입니다.",kg,m*100,kg/(m*m));
        sc.close();
    }
}
