package com.ohgiraffers.hw3.run;

import com.ohgiraffers.hw3.controller.ProductController;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        ProductController con = new ProductController();
        con.mainMenu();
    }
}
