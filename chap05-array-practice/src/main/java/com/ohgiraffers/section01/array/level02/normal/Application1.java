package com.ohgiraffers.section01.array.level02.normal;

import java.text.StringCharacterIterator;
import java.util.Arrays;
import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        int result= 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 하나 입력 : ");
        String str = sc.nextLine();
        System.out.println("검색할 문자 입력 : ");
        String ser = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ser.charAt(0)){
                result++;
            }
        }System.out.println(ser + " 은 " + result + "개 입니다");
        /* 문자열을 하나 입력받아 문자 자료형 배열로 바꾼 뒤
         * 검색할 문자를 하나 입력 받아
         * 입력 받은 검색할 문자가 문자열에 몇개 있는지를 출력하세요
         *
         * -- 입력 예시 --
         * 문자열을 하나 입력하세요 : helloworld
         * 검색할 문자를 입력하세요 : l
         *
         * -- 출력 예시 --
         * 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
         * */

    }

}
