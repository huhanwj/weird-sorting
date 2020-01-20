package com.company;

import java.util.Arrays;
import java.util.Random;

class BogoSort{
    Random random=new Random();
    public void bogoSort(int[] array){
        while(!inOrder(array)){
            shuffle(array);
            System.out.println(Arrays.toString(array));
        }
    }
    public void shuffle(int[] array){
        for(int i=0;i<array.length;i++){
            int Swap_Pos=random.nextInt(i+1);
            int temp=array[i];
            array[i]=array[Swap_Pos];
            array[Swap_Pos]=temp;
        }
    }
    public boolean inOrder(int[] array){
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }
}
public class Main {

    public static void main(String[] args) {
        BogoSort bogo=new BogoSort();
	// write your code here
        int[] array= new int[]{7, 4, 5, 1, 2, 9, 6, 3, 11, 33};
        bogo.bogoSort(array);
    }
}
