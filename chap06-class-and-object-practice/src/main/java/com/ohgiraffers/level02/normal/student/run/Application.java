package com.ohgiraffers.level02.normal.student.run;

import com.ohgiraffers.level02.normal.student.model.vo.StudentVO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("학년 : ");
        int grade = sc.nextInt();
        System.out.println("반 번호 : ");
        int classroom = sc.nextInt();
        sc.nextLine();
        System.out.println("이름 : ");
        String name = sc.nextLine();
        System.out.println("키 : ");
        double height = sc.nextDouble();
        System.out.println("성별 : ");
        char gender = sc.next().charAt(0);

        StudentVO st = new StudentVO(grade,classroom,name,height,gender);
        st.printInformation();



    }
}
