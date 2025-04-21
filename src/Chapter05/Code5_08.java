package Chapter05;

import java.util.Calendar;

public class Code5_08 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        char dayCh;

        System.out.println("현재 요일 번호 : " + day);

        switch (day) {
            case 1:
                dayCh = '일';
                break;
            case 2:
                dayCh = '월';
                break;
            case 3:
                dayCh = '화';
                break;
            case 4:
                dayCh = '수';
                break;
            case 5:
                dayCh = '목';
                break;
            case 6:
                dayCh = '금';
                break;
            case 7:
                dayCh = '토';
                break;
            break;
        }
        System.out.printf("오늘은 %c요일입니다.", dayCh);

    }
}
