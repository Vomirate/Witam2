package com.company;

public class Main {

    static boolean czyToPalindrom (String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "rower";

        if (czyToPalindrom(str))
            System.out.print("Tak");
        else
            System.out.print("Nie");


    }
}
