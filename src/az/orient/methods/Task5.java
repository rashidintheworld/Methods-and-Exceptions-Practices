package az.orient.methods;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ededi daxil edin -> ");
        try {
            int digit = sc.nextInt();
            if (digit == 1) {
                System.out.println("Sadedir");
                return;
            }
            if (digit > 0) {
                boolean primeFoo = isPrime(digit);
                if (isPrime(digit) == false) {
                    System.out.println("Bu eded sade deyildir!");
                } else {
                    System.out.println("Sadedir");
                }
            } else {
                System.out.println("Natural eded daxil edin!");
            }
        }catch (InputMismatchException ex){
            //ex.printStackTrace();
            System.err.println("Reqem daxil edin!(Natural)");
        }finally {
            sc.close();
        }

    }
    public static boolean isPrime(int digit) {
        boolean isFlag = true;
        for (int i = 2; i < digit; i++) {
            if (digit % i == 0) { //murekkebdi
                isFlag = false;
                break;
            }
        }
        return isFlag;
    }
}
