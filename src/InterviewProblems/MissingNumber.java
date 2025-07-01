package InterviewProblems;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {

        /* int[] arr = {1,2,4,5} missing number : 3  */

        int[] arr = {1,2,4,5};
        int num =  arr.length + 1;

        int exceptedSum = (num * (num +1)) / 2;

        // sum
        int sum = Arrays.stream(arr).sum();

        int missingNumber = exceptedSum - sum;
        System.out.println(" Array is  "+Arrays.toString(arr)+ " Missing number is :: "+missingNumber);




    }

}
