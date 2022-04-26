package Other;

public class BigOnotaion {

     /*      Explaining Time Complexity Analysis and Big O notation
        You can think of time complexity analysis (represented using "big O notation" as O(n)) as a measure
    of how many operations your computer has to perform when running a particular program, and the idea
    is that this will tell you something about how long your program takes to run.
        Usually your program will have an input, and time complexity analysis estimates how long your
    program will run based on different input sizes (sometimes on average, sometimes worst case scenario).
          With time complexity analysis we are trying to answer the question: If I have an input of size N, how
    long will my program take to run in terms of N?
     */

    public static void main(String args[]){
        int [] arr = { 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048};
        int num = 128;
        for(int each : arr){
            System.out.println("Constant time: n = " + each + " Operations = " + big_o_1(each));
            System.out.println("Linear time: n = " + each + " Operations = " + big_o_n(each));
            System.out.println("Quadratic time: n = " + each + " Operations = " + big_o_n2(each));
            System.out.println("Logarithmic time: n = " + each + " Operations = " + big_o_logn(each));
            System.out.println("------------------------------------------");
        }
    }

    public static int big_o_1(int n){
        int operation_count = 1;
        return operation_count;
    }

    public static int big_o_n(int n){
        int operation_count = 0;
        for(int i = 0; i < n; i++){
            operation_count++;
        }
        return operation_count;
    }

    public static int big_o_n2(int n){
        int operation_count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                operation_count++;
            }
        }
        return operation_count;
    }

    public static int big_o_logn(int n){
        int operation_count = 0;
        while(n > 0){
            n = n/2;
            operation_count++;
        }
        return operation_count;
    }

}
