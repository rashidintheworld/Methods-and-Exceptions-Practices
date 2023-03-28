package az.orient.methods;

import java.util.Scanner;

public class Task8 {
    //8.	Elə method yaradın ki, bu method daxil edilmiş sətrdən ən uzun sözü qaytarsın. (sözlər boşluq simvolu ilə ayrılmışdır)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Setri daxil edin -> ");
        String str = sc.nextLine();
        if (str.isEmpty() || str.isBlank()) {
            System.out.println("Bos daxil etdiniz");
            return;
        }
        String bigLetter = isBigLetter(str);
        System.out.println("Setrin en uzun sozu/sozleri -> "+bigLetter);
    }

    public static String isBigLetter(String str) {
        String[] strSplit = str.split(" ");
        String max =" ";
        int maxA = 0;
        for (int i = 0; i < strSplit.length; i++) {
            if (maxA < strSplit[i].length()) {
                maxA = strSplit[i].length();
                max = strSplit[i];
            }else if(max.length() == strSplit[i].length()){
                max += " " + strSplit[i];
            }
        }
        return max;
    }
}
