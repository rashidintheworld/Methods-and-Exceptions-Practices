package az.orient.methods;

import java.util.Scanner;

public class Task4R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Daxil edin->");
        String str = sc.nextLine();
        String doubleVowel = isDoubleVowel(str);
        System.out.println("Daxil edilen ifadede cut saitli sozler : "+ doubleVowel);
    }

    public static boolean isVowel(char ch) {
        char[] charArray = "aouie".toCharArray();
        for (char chr : charArray) {
            if (ch == chr) {
                return true;
            }
        }
        return false;
    }


    public static String isDoubleVowel(String str) {
        String[] strArray = str.split(" ");
        String result = "";
        for (String word : strArray) {
            for (int i = 0; i < word.length()-1; i++) {
                char firstLetter = word.charAt(i);
                char secondLetter = word.charAt(i+1);
                if(firstLetter==secondLetter && isVowel(firstLetter)){
                    result+=word+" ";
                }
            }
        }
        return result;
    }
}
