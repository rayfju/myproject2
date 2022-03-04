package com.fju;


public class ScoringNG {
    public static void main(String[] args) {
        String[] names={"Ivan","Raay","Hank","Apple","Frank"};
        int[] eng={90,60,50,40,10};
        int[] math={60,50,70,90,88};
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i] + "\t" + eng[i] + "\t" + math[i] + "\t" + (eng[i] + math[i]) / 2);
        }
    }
}
