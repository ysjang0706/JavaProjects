package Chapter02;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        System.out.println("## 택배 보내기입니다. 다음을 각각 입력하세요. ##");
        System.out.print("받는 사람 : ");
        String m = s.nextLine();
        System.out.print("주소 : ");
        String m1 = s.nextLine();
        System.out.print("무게(g) : ");
        int m2 = s.nextInt();
        System.out.println("** 받는 사람 ==> " + m);
        System.out.println("** 주소 ==> " + m1);
        System.out.println("** 배송비 ==> " + (m2*5) + "원");
        s.close();
        s2.close();
    }
}
