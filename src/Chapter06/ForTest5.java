package Chapter06;

public class ForTest5 {
    public static void main(String[] args) {
        int n = 0;
        for(int i = 500; i <= 1000; i++){
            if(i%2==0) n += i;
        }
        System.out.printf("500부터 1000까지 홀수들의 합은 %d입니다.",n);
    }
}
