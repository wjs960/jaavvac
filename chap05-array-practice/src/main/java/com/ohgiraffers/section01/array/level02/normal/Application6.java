package com.ohgiraffers.section01.array.level02.normal;

import java.util.Arrays;
import java.util.Random;

public class Application6 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int[10];
        int min = 10;
        int max = 1;

        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(10)+1;
            System.out.print(" " + (arr[i]));

            if(arr[i]  < min){
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];

            }

        }
        System.out.println();
        System.out.println("최대 : "+max);
        System.out.println("최소 : " + min);



        /* 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
         * 1 ~ 10 사이의 난수를 발생시켜 배열에 초기화 후
         * 배열 전체 값과 그 값 중에서 최대값과 최소값을 찾아서 출력하세요.
         *
         * =========== 출력 ============
         * 2 10 5 2 3 7 3 7 9 7
         * 최대값 : 10
         * 최소값 : 2
         * */
    }

}
