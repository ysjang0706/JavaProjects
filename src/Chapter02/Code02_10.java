package Chapter02;


import java.util.Scanner;

public class Code02_10 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in); //Scanner 객체 생성, 생성된 객체의 주소 값을 반환받아서 s라는 객체 참조변수에 대입했다.
        Scanner s2 = new Scanner(System.in);
        System.out.print("* 정수값 입력 1: ");
        int num1 = s1.nextInt();
        System.out.println("사용자1 입력값 : " + num1);

        System.out.print("* 실수값 입력 2: ");
        double num2 = s1.nextDouble();
        System.out.println("사용자2 입력값 : " + num2);

        System.out.print("* 성명 입력 3: ");
        String name = s2.nextLine();
        System.out.println("사용자3 입력값 : " + name);

        s1.close();
        s2.close();
    }
}
