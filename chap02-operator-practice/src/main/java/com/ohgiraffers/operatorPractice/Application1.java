package com.ohgiraffers.operatorPractice;

public class Application1 {
    
    public static void main(String[] args) {
        int i = 1;
        for(i = 0; i < 30; i++){

            System.out.print(i + " 은/는 ");
            if ((i % 2) == 0) {
                System.out.println("짝수");
            } else {
                System.out.println("홀수");
            }
        }
        /*
         * 임의의 정수를 하나 선언하고 선언한 숫자가 짝수이면 "짝수다", 짝수가 아니면
         * "홀수다"를 출력하세요
         *
         * ------- 출력 결과 화면 ----------
         *
         * 예)정수 9를 선언했을 경우
         *
         * 홀수
         * */
    }

}
