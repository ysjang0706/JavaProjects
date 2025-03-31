package Chapter02;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== 단순 계산기 =====\n\n\n\n\n");
        System.out.print("정수 1 ==> ");
        int n1 = sc.nextInt();
        System.out.print("정수 2 ==> ");
        int n2 = sc.nextInt();
        System.out.printf("%d + %d = %d\n", n1,n2,n1+n2);
        System.out.printf("%d - %d = %d\n", n1,n2,n1-n2);
        System.out.printf("%d * %d = %d\n", n1,n2,n1*n2);
        System.out.printf("%d / %d = %f\n", n1,n2,(float) n1/n2);
        System.out.printf("%d %% %d= %d\n", n1,n2,n1%n2);
    }
}
