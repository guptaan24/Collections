package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr={2,4,2,0,5,2,7,8,2};
        bubbleSort(arr);
    }

    static void bubbleSort(int[] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        Arrays.stream(arr).forEach(System.out::println);

    }
}
