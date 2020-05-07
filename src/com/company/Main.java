package com.company;

public class Main {

    public static void main(String[] args) {
        boolean bln;

        for(int i = 2; i <= 100; i++){
            bln = true;

            for(int j = 2; j<i; j++){
                if(i % j == 0) {
                    bln = false;
                    break;
                }
            }
            /*
                Цикл сверху начинает проверку, может ли число i делиться
                начиная с числа 2 до i-1. Если находит то bln меняется на
                false и выходит из цикла.
             */

            if(bln){
                System.out.println(i);
            }
        }
    }
}
