package az.orient.methods;


import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Setr sayini daxil edin ->");
        try {
            int countOfCol = sc.nextInt();
            sc.nextLine();
            String[] arrStr = new String[countOfCol];
            for (int i = 0; i < countOfCol; i++) {
                System.out.println(i + 1 + ". setri daxil edin ");
                arrStr[i] = sc.nextLine();
            }
            String bigcolumn = bigColumn(arrStr);
            System.out.println("Uzun setr ->" + bigcolumn);
        } catch (NegativeArraySizeException ex) {
            ex.printStackTrace();
            System.err.println("Massiv olcusu natural eded olmalidir!");
        } catch (InputMismatchException ex) {
            ex.printStackTrace();
            System.err.println("Array olcusunu duz daxil edin! \n Natural eded...");
        } catch (Exception ex) {
            System.err.println("Xeta bas verdi!");
        } finally {
            sc.close();
        }
    }

    public static String bigColumn(String[] arrStr) {
        String strMax = "";
        int strMaxLen = 0;
        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].length() > strMaxLen) {
                strMax = (arrStr[i]);
                strMaxLen = arrStr[i].length();
            } else if (arrStr[i].length() == strMaxLen) {
                strMax += " " + arrStr[i];
            }
        }
        return strMax;
    }
}