package com.ohgiraffers.section01.array.level02.normal;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {
        int num2;
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("양의 정수 입력 : " );
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("베열 " + i + " 번째 인덱스에 넣을 값 : ");
            num2 = sc.nextInt();
            sc.nextLine();
            arr[i] = num2;
            }
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr[j] + " ");
                result +=arr[j];
            }
        System.out.println("\n 총합 : " + result );

        }
        }


        /* 사용자가 입력한 배열의 길이만큼의 정수형 배열을 선언 및 할당하고
         * 배열 인덱스 넣을 값 역시 사용자가 입력하여 배열을 초기화히세요.
         *
         * 그리고 배열 전체 값과 각 인덱스에 저장된 값들의 합을 출력핫헤요.
         *
         * ========= 출력 ===========
         * 정수를 입력하세요 : 3
         * 배열 0번째 인덱스에 넣을 값 : 1
         * 배열 1번째 인덱스에 넣을 값 : 2
         * 배열 2번째 인덱스에 넣을 값 : 3
         *
         * 1 2 3
         * 총합 : 6
         *
         * */



