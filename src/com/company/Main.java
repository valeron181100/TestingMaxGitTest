package com.company;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = 6;
        int[] srcArr = new int[]{1, 3, 5, 2, 2, 2};
        ArrayList<Integer> bitMask = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            //srcArr[i] = scanner.nextInt();
            bitMask.add(srcArr[i] % 2);
        }
        if(bitMask.size() % 2 != 0){
            System.out.println(-1);
        }
        else {
            bitMask.sort(Integer::compareTo);

            for (int i = 0; i < bitMask.size(); i++) {
                int j =i + 1;
                int temp = bitMask.get(j);
                bitMask.set(j, bitMask.get(bitMask.size() - 1 - j));
                bitMask.set(bitMask.size() - 1 - j, temp);
            }
            int f = 0;
        }
    }
}