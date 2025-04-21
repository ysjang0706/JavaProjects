package Chapter04;

public class LAB_Chapter04 {
    public static void main(String[] args) {
        String str1 = "블랙핑크";
        System.out.println("원본 문자열 : " + str1);
        System.out.print("거꾸로 문자열 : ");
        for (int i = str1.length() - 1; i >= 0; i--) {
            System.out.print(str1.charAt(i));
        }
        String str2 = "Java";
        String resultStr = str2.substring(0,1).toLowerCase();
        resultStr += str2.substring(1,2).toUpperCase();
        resultStr += str2.substring(2,3).toUpperCase();
        resultStr += str2.substring(3,4).toUpperCase();
        System.out.println("\n원본 문자열 : " + str2);
        System.out.println("str2의 변환 문자열 : " + resultStr);
        //




    }
}
