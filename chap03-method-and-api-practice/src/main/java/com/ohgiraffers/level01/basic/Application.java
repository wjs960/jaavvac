package com.ohgiraffers.level01.basic;

public class Application {

    /* 실행용 메소드 */
    public static void main(String[] args) {

        // Calculator 클래스의 메소드를 호출 해서 실행
        Calculator calculator = new Calculator();

        calculator.checkMethod();
        calculator.sumTwoNumber(10,20);
        calculator.multiTwoNumber(10,20);
    }
    
}
