package com.meli.aula03.TMAula3;

public class SortUtil {
    public static void sort (Precedente arr []){
        int n = arr.length;

        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1].precedeA(arr[j])<=0){
                    //swap elements
                    Precedente temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }
}
