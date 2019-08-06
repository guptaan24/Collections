package search;

import java.util.Arrays;

public class BinarySearch {
//
//
//    public static void main(String[] args) {
//        Integer[] arr={1,2,3,4,5,6,7,8,9};
//        System.out.println(binarySearch(arr,10));
//    }

    private static Integer binarySearch( Integer[] arr,int value){
        int mid=arr.length/2;
        if(value==arr[mid]){
            return value;
        }
        if(arr.length==1){
            return null;
        }


        if(value<arr[mid]){
            Integer[] tempArr = Arrays.copyOfRange(arr, 0, mid);
            return binarySearch(tempArr,value);
        }else{
            Integer[] tempArr = Arrays.copyOfRange(arr, mid+1, arr.length);
            return binarySearch(tempArr,value);
        }
    }
}
