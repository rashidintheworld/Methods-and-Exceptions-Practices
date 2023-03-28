package az.orient.methods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nece eded daxil etmek isteyirsiniz?");
        try {
            int countOfNums = sc.nextInt();
            int[] arrOfNums = new int[countOfNums];
            for (int i = 0; i < countOfNums; i++) {
                System.out.println(i + 1 + ". reqemi daxil edin-> ");
                arrOfNums[i] = sc.nextInt();
                boolean primeNumber = isPrime(arrOfNums, i);
                String message = primeNumber ? "sadedir!" : "murekkebdir!";
                //xususi hallar;
                if (arrOfNums[i] == 1) {
                    message = "1 ne sade ne murekkebdir!";
                } else if (arrOfNums[i] <= 0) {
                    message = "natural deyildir!";
                }
                System.out.println(arrOfNums[i] + " ededi " + message);
            }
        } catch (NegativeArraySizeException ex) {
            System.err.println("Arrayin olcusun natural daxil edilmelidir!");
        } catch (InputMismatchException ex) {
            System.err.println("Natural eded daxil edilmelidir!");
        } finally {
            sc.close();
        }
    }

    public static boolean isPrime(int[] arrOfNums, int i) {
        boolean isFlag = true;
        for (int j = 2; j < arrOfNums[i]; j++) {
            if (arrOfNums[i] % j == 0) {
                isFlag = false;
                break;
            }
        }
        return isFlag;
    }
}
