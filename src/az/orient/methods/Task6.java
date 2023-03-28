package az.orient.methods;

import java.util.Scanner;

import static az.orient.methods.exceptions.Exceptions.isBlankOrisEmpty;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Soyadi daxil edin ->");
        try {
            String str = sc.nextLine();
            isBlankOrisEmpty(str);
            boolean isrealazesurname = isRealAzeSurname(str);
            if(isrealazesurname==false){
                System.out.println("Esl Az soyadidir");
            }else{
                System.out.println("Esl Az soyadi deyildir");
            }
        }catch (IllegalArgumentException e){
            System.err.println("Xeta : "+e.getMessage());
        }
    }
    public static boolean isRealAzeSurname(String str){
        String[] surnameLastChars = {"ova", "ov", "zadə", "li", "lü", "lu", "oğlu", "qızı", "soy"};
        boolean isFlag = false;
        String repairStr = str.toLowerCase().trim();
        for (int i = 0; i < surnameLastChars.length; i++) {
            if (repairStr.substring(repairStr.length() - surnameLastChars[i].length()).equals(surnameLastChars[i])) {
                isFlag = true;
                break;
            }
        }
        return !isFlag;
    }
}
