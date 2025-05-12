package Chapter06;

public class ForTest10 {
    public static void main(String[] args) {
        String[][] teams = {{"A","B","C","D"},{"a","b","c"},{"Aa","Bb","Cc","Dd"}};

        for(int i = 0; i < teams.length; i++) {
            System.out.print(i+1+"팀 :\t");
            for(int j = 0; j < teams[i].length; j++) {
                System.out.print(teams[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
