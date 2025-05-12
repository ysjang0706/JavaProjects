package Chapter06;

import java.util.Scanner;

public class ForTest3 {
    public static void main(String[] args) {
        int x = 1;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) x *= i;
        System.out.printf("%d명의 줄을 세우는 경우의 수는 %d이다.",n,x);
    }
}
