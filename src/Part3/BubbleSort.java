package Part3;

import java.util.Arrays;

public class BubbleSort {

    //Natasha, Hi. Below is my implementation. Feel free to change it. We can write Mosh's implementation too.

    public static void main(String [] args){
        int [] nums = {8, 2, 4, 1, 3};
        System.out.println(Arrays.toString(bubbleSort(nums)));
    }

    public static int [] bubbleSort(int [] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length; j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public static int [] bubbleSortMosh(int [] arr){
        boolean isSorted;
        for(int i = 0; i < arr.length; i++){
            isSorted = true;
            for(int j = 1; j < arr.length-i; j++){
                if(arr[j]< arr[j-1]){
                    swap(arr, j, j-1);
                    isSorted = false;
                }
            }
            if(isSorted){
                return arr;
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
