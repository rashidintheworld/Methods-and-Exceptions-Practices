package az.orient.methods;

import java.util.Scanner;

// FAIL
public class Task4 {
    //4.	Elə method yaradın ki, bu method daxil edilmiş cümlədən qoşa saitli sözləri qaytarsın (saat, maaş və s.)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Daxil edin :");
        String str = "alma saat maas";
        String resFoo = isDoubleVowel(str);
        System.out.println(resFoo);
    }

    public static String isDoubleVowel(String str) {
        String[] strSplit = str.split(" ");
        String result = "";
        String[] strsSaits = {"aa", "oo", "uu", "ee", "ii"};
        for (String i : strSplit) {
            for (int j = 0; j < i.length()-1; j++) {
                for (int k = 0; k < strsSaits.length; k++) {
                    if (i.substring(j,j+2).equals(strsSaits[k])) {
                        result += i + " ";
                    }
                }
            }
        }
        return result;
    }


}