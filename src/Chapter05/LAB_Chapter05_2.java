package Chapter05;

import java.util.Scanner;

public class LAB_Chapter05_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================= 가위, 바위, 보 게임 =================");

        System.out.print("* 가위, 바위, 보 중에 하나를 입력 : ");
        String myHand = sc.nextLine();

        String[] hands = {"가위" ,"바위", "보"};
        String computerHand = hands[(int)(Math.random()*hands.length)];

        if(myHand.equals(computerHand)) System.out.println("비겼습니다!");
        else if(myHand.equals("가위")) {
            if (computerHand.equals("바위")) System.out.println("졌습니다!");
            else System.out.println("이겼습니다!");
        }
        else if(myHand.equals("바위")) {
            if (computerHand.equals("보")) System.out.println("졌습니다!");
            else System.out.println("이겼습니다!");
        }
        else if(myHand.equals("보")) {
            if (computerHand.equals("가위")) System.out.println("졌습니다!");
            else System.out.println("이겼습니다!");
        }


        sc.close();
    }
}
