import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "alma saat maas";
        String[] strSplit = str.split(" ");
        char[] charsSaits = {'a', 'o', 'u', 'e', 'i'};
        String w = "";
        for (String i : strSplit) {
            int qosa = 0;
            for (char a : charsSaits) {
                for (int j = 0; j < i.length(); j++) {
                    char ch = i.charAt(j);
                    if (i.charAt(j) == a) {
                        qosa++;
                        if (qosa == 2) {
                            w += i + " ";
                        }

                    }
                }

            }
            qosa = 0;
        }
        System.out.println(w.trim());

    }

}