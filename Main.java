// user input from terminal

import java.util.Scanner;

public class Main {
    public static void main(String[] a){
        // creo un array con quattro elementi
        int nums[] = new int[4];
        // definisco ogni elemento
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 2;
        nums[3] = 3;
        // ciclo for per stampare tutti gli elementi dell'array
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}