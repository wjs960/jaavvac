package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {



    public static void main(String[] args) {
        StudentDTO[] stud = new StudentDTO[10];
        int i = 0;
        while (true){


            Scanner sc = new Scanner(System.in);
            System.out.println("학년 : ");
            int grade = sc.nextInt();
            sc.nextLine();
            System.out.println("반 : ");
            int classroom = sc.nextInt();
            sc.nextLine();
            System.out.println("이름 : ");
            String name = sc.nextLine();
            System.out.println("국어 점수");
            int kor = sc.nextInt();
            System.out.println("영어 점수");
            int eng = sc.nextInt();
            System.out.println("수학 점수");
            int math = sc.nextInt();
            sc.nextLine();
            System.out.println((i+1) + " 명 추가 되었습니다.");

        //    stud[i] = new StudentDTO();
            stud[i] = new StudentDTO(grade,classroom,name,kor,eng,math);
                stud[i].setGrade(grade);
                stud[i].setClassroom(classroom);
                stud[i].setName(name);
                stud[i].setKor(kor);
                stud[i].setEng(eng);
                stud[i].setMath(math);
            System.out.println("계속 추가하시겠습니까? Y/N");
            String ys = sc.nextLine();
            if(ys.equalsIgnoreCase("N")){
                break;
            }else if(ys.equalsIgnoreCase("Y")){
                i++;
            }else {
                System.out.println("잘못입력");
                break;
            }
        }

        for (int k = 0; k < i+1; k++){

            double avg = (stud[k].getEng() + stud[k].getKor() + stud[k].getMath()) / 3;
            //System.out.println(avg);
            System.out.println(stud[k].info() + " 평균 : " + avg);
        }
        }
    }


