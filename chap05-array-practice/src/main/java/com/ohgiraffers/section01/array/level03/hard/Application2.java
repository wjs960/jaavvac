package com.ohgiraffers.section01.array.level03.hard;

import java.util.Arrays;
import java.util.Random;

public class Application2 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] lottery = new int[6];
        int[] bonas = new int[1];
        bonas[0] = random.nextInt(44)+1 ;
        for (int i= 0; i < lottery.length; i++) {
            lottery[i] = random.nextInt(44)+1 ;

            if (i == lottery.length-1){
                Arrays.sort(lottery);
                for (int j : lottery){
                    System.out.print(j);
                    System.out.print(" ");

                }
            }

        }System.out.println("뽀나스 번호"+bonas[0]);

        /* 로또번호 생성기
         * 6칸 짜리 정수 배열을 하나 생성하고
         * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
         * 오름차순 정렬하여 출력하세요
         * */

    }

}
