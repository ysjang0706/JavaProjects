package Chapter06;

public class ForTest4 {
    public static void main(String[] args) {
        int n = 0;
        int count = 10;
        for(int i = 1; i <= 10; i++){
            if(i%2==0) n += i;
        }
        System.out.printf("1부터 %d까지 짝수들의 합은 %d입니다.",count,n);
    }
}
