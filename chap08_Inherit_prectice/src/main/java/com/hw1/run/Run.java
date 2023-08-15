package com.hw1.run;

import com.hw1.model.dto.Emplpyee;
import com.hw1.model.dto.Student;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Student[] stud = new Student[3];

        stud[0] = new Student("홍길동",20,178.2,70.0,1,"정보시스템공학과");
        stud[1] = new Student("김말똥",21,187.3,80.0,2,"경역학과");
        stud[2] = new Student("강개순",23,167.0,45.0,4,"정보통신공학과");


        for (Student list : stud) {
            System.out.println(list.info());
        }

        Emplpyee[] emp = new Emplpyee[10];
        int count = 0;
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("이름 : ");
            String name = sc.nextLine();
            System.out.println("나이 : ");
            int age = sc.nextInt();
            System.out.println("신장 : ");
            double height = sc.nextDouble();
            sc.nextLine();
            System.out.println("몸무게 : ");
            double weight = sc.nextDouble();
            sc.nextLine();
            System.out.println("급여 : ");
            int sal = sc.nextInt();
            sc.nextLine();
            System.out.println("부서 : ");
            String dept = sc.nextLine();
            emp[count] = new Emplpyee(name, age, height, weight, sal, dept);
            System.out.println((count+1) + " 명 추가 됨");
            System.out.println("계속 추가 하나요? Y/N");
            String ys = sc.nextLine();
            if (ys.equalsIgnoreCase("Y")){
                count++;
            } else if (ys.equalsIgnoreCase("N")) {
                for (int i = 0; i <= count; i++){
                    System.out.println(emp[i].info());
                }
                break;

            }else {
                System.out.println("잘못입력");
            }

        }


    }
}
