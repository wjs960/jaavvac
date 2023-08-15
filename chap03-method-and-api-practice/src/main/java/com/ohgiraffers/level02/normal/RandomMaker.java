package com.ohgiraffers.level02.normal;

import java.util.Random;

public class RandomMaker {



    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : rockPaperScissors
     *
     * 가위,바위,보 중에 하나를 출력
     * (가위,바위,보 는 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 가위
     * */



    public static String rockPaperScissors(){


        int rock = ((int)(Math.random()*10));
        if(rock > 0 && rock <= 3){
            System.out.println("주먹");
        } else if (rock >= 4 && rock <= 6 ) {
            System.out.println("가위");
        } else if (rock >= 7 && rock <= 9) {
            System.out.println("보");
        }

        return new String();
    }
    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : tossCoin
     *
     * 동전 앞/뒤 중에 하나를 출력
     * (앞면,뒷면은 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 앞면
     *
     * */
    public static String tossCoin() {
        Random random = new Random();
        String result = "";
        int rock = random.nextInt(2);
        switch (rock){
            case 0 : result = "앞"; break;
            case 1 : result = "뒤"; break;
        }

        System.out.println(result);
    return result;
    }
}
