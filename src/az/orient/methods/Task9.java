package az.orient.methods;

import java.util.Locale;
import java.util.Scanner;

public class Task9 {
    //9 Elə method yaradın ki, bu method daxil edilmiş sətrdə ən çox sait olan sözü qaytarsın (sözlər boşluq simvolu ilə ayrılmışdır)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Daxil edin setri :");
        String str = sc.nextLine();
        if (str.isEmpty() || str.isBlank()) {
            System.out.println("Bos daxil etdiniz");
            return;
        }
        String mostVowels = isMostVowels(str);
        System.out.println("En cox sait olan soz/sozler -> " + mostVowels);
    }

    public static String isMostVowels(String str) {
        int maxLen = 0;
        String maxStr = "";
        String[] strSplit = str.split(" ");
        char[] arrVowels = "aioeu".toCharArray();
        for (String i : strSplit) {
            int countOfSait = 0;
            for (int j = 0; j < i.length(); j++) {
                char ch = i.charAt(j);
                for (int k = 0; k < arrVowels.length; k++) {
                    if (ch == arrVowels[k]) {
                        countOfSait++;
                    }
                }
            }
            if (countOfSait > maxLen) {
                maxStr = i;
                maxLen = countOfSait;
            } else if (countOfSait == maxLen) {
                maxStr += " " + i;
            }
        }
        return maxStr;
    }
}