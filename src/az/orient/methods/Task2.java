package az.orient.methods;

import java.util.InputMismatchException;
import java.util.Scanner;

import static az.orient.methods.exceptions.Exceptions.isBlankOrisEmpty;

public class Task2 {
    // 2. Elə method yaradın ki, bu method daxil aedilmiş sətrdə boşluqların sayını qaytarsın
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Ifadeni daxil edin : ");
            String str = sc.nextLine();
            isBlankOrisEmpty(str);
            int strFun = bosluq(str);
            System.out.println("Bosluq sayi->" + strFun);
        } catch(IllegalArgumentException e) {
            System.err.println("Xeta: " + e.getMessage());
        } catch (Exception ex){
            System.err.println("Gozlenilmeyen xeta bas verdi!");
        } finally {
            sc.close();
        }
    }
    public static int bosluq(String str) {
        int sayBosluq = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                sayBosluq++;
            }
        }
        return sayBosluq;
    }
}
