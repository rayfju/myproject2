package com.fju.score;

public class ScoringNG {
    public static void main(String[] args) {
        String[] names={"ray ","Hank","want","Fuck","you "};
        int[] eng={90,60,50,40,10};
        int[] math={60,50,70,90,88};
        for (int i = 0; i < 5; i++) {
            if (i !=10 ) {
                System.out.println(names[i] + "\t" + eng[i] + "\t" + math[i] + "\t" + (eng[i] + math[i]) / 2);
            }
        }
    }

}
