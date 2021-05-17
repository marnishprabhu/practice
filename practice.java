package com.calculation;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        int input[] = new int[]{10,15,20,25,30};
        int[] output;

        if(input.length%2==0){

             output = new int[input.length/2];
        }else{
             output = new int[input.length/2+1];

        }
        int c = output.length;

        while (c>0){
            int sum = 0;
            int counter = 0;

            for(int i = 0 ;i<input.length;i=i+2){
                sum = 0;
                try{
                    sum = sum+input[i]+input[i+1];

                }
                catch (Exception e){
                    sum = input[i];
                }
                output[counter] = sum;
                counter =counter+1;
            }
            printArray(output);
            input = output;
            output = new int[output.length-1];
            c = c-1;
        }

    }

    private static void printArray(int[] output) {
        for (int a:
             output) {
            System.out.print(a+" ");
        }
        System.out.println();
    }
}
