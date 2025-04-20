import java.util.Scanner;

public class Lab03_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("자바(3학점) 성적을 입력하세요 : ");
        double n = sc.nextDouble()*3;
        System.out.print("모바일(2학점) 성적을 입력하세요 : ");
        double m = sc.nextDouble()*2;
        System.out.print("엑셀(1학점) 섣적을 입력하세요 : ");
        double a = sc.nextDouble();
        System.out.printf("평균 학점은 %.1f입니다.",(a+m+n)/6);
    }
}

