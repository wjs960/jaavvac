package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.vo.ProductDTO;

import java.util.Scanner;

public class ProductController {
    ProductDTO[] plist = new ProductDTO[10];
    public static int count = 0;
    public void mainMenu(){
        do{
            System.out.println("===제품 관리 메뉴===");
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("9. 프로그램 종료");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            switch (num){
                case 1 : productInput();break;
                case 2 : productPrint(); break;
                case 9 :
                    System.out.println("프로그램 종료"); return;
                default:
                    System.out.println("잘못 입력");
            }

        }while (true);

    }
    public void productInput () {

        Scanner sc = new Scanner(System.in);
        System.out.println("제품 번호 : ");
        int pld = sc.nextInt();
        sc.nextLine();
        System.out.println("제품명 : ");
        String pName = sc.nextLine();
        System.out.println("제품 가격 : ");
        int price = sc.nextInt();
        System.out.println("제품 세금 : ");
        double tax = sc.nextDouble();

        plist[count] = new ProductDTO(pld, pName, price, tax);


    }

    public void productPrint() {
        for (int i = 0; i < count; i++){
            System.out.println(plist[i].info());
        }

    }
}
