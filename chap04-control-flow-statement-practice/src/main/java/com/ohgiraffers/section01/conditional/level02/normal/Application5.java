package com.ohgiraffers.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

        /* 임의의 숫자를 입력받아 해당 계절을 출력해주세요
         * 단, 1~12사이의 숫자가 아닌 값이 들어는것은 "잘못입력하셨습니다"를 출력
         * 계절 구분
         * 봄 : 3월,4월,5월
         * 여름: 6월,7월,8월
         * 가을: 9월,10월,11월
         * 겨울: 12월,1월,2일
         *
         * -----  출력 -----
         * 숫자를 입력하세요 : 1
         * 겨울
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("1~12 숫자 입력 :");
        String num = sc.nextLine();
        String message = "";
        switch (num){
            case "1" : message = "겨울"; break;
            case "2" : message = "겨울"; break;
            case "3" : message = "봄"; break;
            case "4" : message = "봄"; break;
            case "5" : message = "봄"; break;
            case "6" : message = "여름"; break;
            case "7" : message = "여름"; break;
            case "8" : message = "여름"; break;
            case "9" : message = "가을"; break;
            case "10" : message = "가을"; break;
            case "11" : message = "가을"; break;
            case "12" : message = "겨울"; break;
            default:message ="잘못입력"; break;
        }
        System.out.println(message);
    }

}
