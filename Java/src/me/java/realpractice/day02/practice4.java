package me.java.realpractice.day02;

import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("숫자 입력: ");
        int num = sc.nextInt();
        if (num>0){
            System.out.println("양수");
        } else if (num == 0) {
            System.out.println("0");
        }else{
            System.out.println(num);
        }


    }
}
