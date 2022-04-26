package Other;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        //            0  1  2   3   4
        int n = arr.length;
        int x = 10;
        int result = binarySearchTwo(arr, 0, n-1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }

    //start = 0,   end = 4,    num = 10;
    public static int binarySearchTwo(int [] arr, int start, int end, int num){

        if(end >= start){
            int middle = start + (end - start)/2;

            if(arr[middle] == num) return middle;

            if(arr[middle] > num) return binarySearchTwo(arr, start, middle - 1, num);

            if(arr[middle] < num) return binarySearchTwo(arr, middle + 1, end, num);

        }
        return -1;
    }

    public static int binarySearchTwo(int [] arr, int num){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int middle = start + (end - start)/2;

            if(arr[middle] == num) return middle;

            if(arr[middle] < num) start = middle + 1;

            if(arr[middle] > num) end = middle -1;
        }
        return -1;
    }


    // Returns index of x if it is present in arr[l..
    // r], else return -1
    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

}
