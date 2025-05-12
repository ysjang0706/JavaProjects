package Chapter06;

import java.util.ArrayList;

public class ForTest {
    public static void main(String[] args) {
        String[] names = {"a","b","c","d","e"};
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": 서울정수캠퍼스 인공지능소프트웨어과");
            arrayList.add(names[i]);
        }

        for (String name : arrayList) {
            System.out.println(name);
        }


    }
}
