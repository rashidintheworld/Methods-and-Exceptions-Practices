package az.orient.methods;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nece setr daxil etmek isteyirsen ?");
        try {
            int countOfCol = sc.nextInt();
            sc.nextLine();
            String[] arrStr = new String[countOfCol];
            for (int i = 0; i < countOfCol; i++) {
                System.out.println(i + 1 + ". sozu daxil edin :");
                arrStr[i] = sc.next();
            }
            String sameLetter = isSame(arrStr);
            System.out.println("Baslangic ve son herfi eyni olan sozler -> " + sameLetter);

        }catch (NegativeArraySizeException e){
            System.err.println("Arrayin olcusu natural olmalidir!");

        }catch (InputMismatchException e){
            System.err.println("Natural eded daxil edin!");
        }finally {
            sc.close();
        }
    }
    public static String isSame(String[] arrStr) {
        String a = "";
        for (String j : arrStr) {
            if (j != null) {
                if (j.charAt(0) == j.charAt(j.length() - 1)) {
                    a += j + " ";
                }
            }
        }
        return a;
    }
}