package Chapter02;

public class Code02_09 {
    public static void main(String[] args) {
        int num1 =10, num2 =20;
        double result;
        result = num1+num2;
        System.out.printf("%d + %d = %.1f\n", num1, num2, result);
        //정수를 정수형으로 나누면 결과는 정수부만 저장됨, 정수형 둘 줃 하나를 실수형으로 변환해서 연산
        result = num1/(double)num2;
        System.out.printf("%d / %d = %.1f\n", num1, num2, result);
    }
}
