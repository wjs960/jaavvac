package com.ohgiraffers.section01.array.level02.normal;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
         * 성별 자리 이후부터 *로 가려서 출력하세요
         *
         * -- 입력 예시 --
         * 주민등록번호를 입력하세요 : 990101-1234567
         *
         * -- 출력 예시 --
         * 990101-1******
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("주민번호 입력 : ");
        String num = sc.nextLine();
        char[] arr = new char[num.length()];
        for (int i = 0; i < arr.length; i++){
            if (i <= 7 ){
                arr[i] = num.charAt(i) ;
            }else if(i >= 8 ){
                arr[i] = '*';
            }
            System.out.print(arr[i]);
        }
        }
    }


