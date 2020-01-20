package com.company;

public class Main {
    public static void SleepSort(int[] array){
        for (int num:array){
            new Thread(()->{
                try{
                    Thread.sleep((num));
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(num);
            }).start();
        }
    }
    public static void main(String[] args) {
        int[] array={21,31,51,2,41,12,5,49};
        SleepSort(array);
    }
}
