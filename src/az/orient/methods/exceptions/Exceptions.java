package az.orient.methods.exceptions;

public class Exceptions {
    public static void isBlankOrisEmpty(String str){
        if(str.isEmpty() || str.isBlank()){
            throw new IllegalArgumentException("Bos input daxil etdiniz!");
        }
    }
}
