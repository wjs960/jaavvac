package com.ohgiraffers.section02.loopingAndBranching.level01.basic;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("숫 자 입력 : ");
        int num = sc.nextInt();

        for (int i = 1 ; i <= num; i++){

            if ((i % 2) != 0)continue;
           result += i;
        }
        System.out.println("1부터 " + num + "까지의 합 " + result);
        /* 1부터 입력받은 정수까지의 짝수의 합을 구하세요
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 10
         *
         * -- 출력 예시 --
         * 1부터 10까지 짝수의 합 : 30
         * */

    }

}
