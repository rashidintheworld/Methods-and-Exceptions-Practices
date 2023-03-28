package az.orient.methods;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    // 3258
    // 23581
    // 23518;
    // ----
    // 12358


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Daxil edin:");
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i =0 ;i<a ; i++){
            System.out.println("Massivin "+(i+1)+". elementini daxil edin :");
            arr[i]= sc.nextInt();
        }
        for(int i = 0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr.length-1 ;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int arrElement : arr){
            System.out.println(arrElement);
        }
    }
}
