package Chapter06;

import java.util.Scanner;

public class LAB06_04 {
    public static void main(String[] args) {
        int com,us,count = 0;
        Scanner sc = new Scanner(System.in);
        while(true) {
            count++;
            System.out.printf("==== %d회 게임 ====\n", count);
            com = (int)(Math.random()*5 + 1);
            System.out.print("컴퓨터가 생각한 숫자는 ? ==> ");
            us = sc.nextInt();
            if(us == com) {
                System.out.println("맞추셨네요 !!");
                break;
            }
            else{
                System.out.printf("틀렸습니다. 컴퓨터가 생각한 숫자는 %d입니다 ㅜㅜ\n",com);
            }
        }
    }
}
