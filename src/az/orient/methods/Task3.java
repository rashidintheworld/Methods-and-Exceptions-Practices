package az.orient.methods;

import java.util.Scanner;

import static az.orient.methods.exceptions.Exceptions.isBlankOrisEmpty;

public class Task3 {
    //3.Elə method yaradın ki, bu method daxil edilmiş sətrdə yalnız rəqəmləri qaytarsın
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ifadeni daxil edin : ");
        String str = sc.nextLine();
        try {
            isBlankOrisEmpty(str);
            String strDig = isDigit(str);
            System.out.println("Original Metn -> "+str);
            System.out.println("Ancaq Reqemler -> "+strDig);
        }catch (IllegalArgumentException ex){
            System.err.println("Xeta:"+ex.getMessage());
        }
    }
    public static String isDigit(String str) {
        String strDef = " ";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >=48 && ch <= 57) {
                strDef += (ch)+" ";
            }
        }
        return strDef;
    }
}
