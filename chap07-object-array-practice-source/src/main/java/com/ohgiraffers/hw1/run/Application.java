package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {
    public static void main(String[] args) {


        EmployeeDTO[] empy1;
        empy1 = new EmployeeDTO[3];

        empy1[0] = new EmployeeDTO();
        empy1[1] = new EmployeeDTO(1,"홍길동",19,'M',"01022223333","서울 잠실");
        empy1[2] = new EmployeeDTO(2,"강말순","교육부","강사",20,'F',1000000,0.01,"01022223333","서울 마곡");

        System.out.println(empy1[0].information());
        System.out.println(empy1[1].information());
        System.out.println(empy1[2].information());


        empy1[0].setEmpName("김말똥");
        empy1[0].setDeot("영업부");
        empy1[0].setJob("팀장");
        empy1[0].setAge(30);
        empy1[0].setGender('M');
        empy1[0].setSalary(300000);
        empy1[0].setBonusPoint(0.2);
        empy1[0].setPhone("01055559999");
        empy1[0].setAddress("전라도 광주");
        System.out.println(empy1[0].information());
        empy1[1].setDeot("기획부");
        empy1[1].setJob("부장");
        empy1[1].setSalary(400000);
        empy1[1].setBonusPoint(0.3);
        System.out.println(empy1[1].information());

        int sal =0;
        int avg = 0;
        for (int i =0; i < empy1.length; i++) {
            sal = (int) (((empy1[i].getSalary() * empy1[i].getBonusPoint()) + empy1[0].getSalary()) )* 12;


            avg = + avg + sal;
            System.out.println(empy1[i].getEmpName() + " 의 연봉" + sal);
        }

        System.out.println("직원들의 평균영본 "+avg/3);
    }
}
