package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "ABCD";
        System.out.println(reverseString(str));
    }

    // Reverse a string
    private static String reverseString(String str) {
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end--;
        }
        return String.valueOf(arr);
    }

}
