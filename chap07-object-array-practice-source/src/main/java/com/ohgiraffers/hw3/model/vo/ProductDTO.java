package com.ohgiraffers.hw3.model.vo;

import com.ohgiraffers.hw3.controller.ProductController;

public class ProductDTO {
    private int pld;
    private String pName;
    private int price;
    private double tax;

    public ProductDTO() {
    }

    public int getPld() {
        return pld;
    }

    public void setPld(int pld) {
        this.pld = pld;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public ProductDTO(int pld, String pName, int price, double tax) {
        this.pld = pld;
        this.pName = pName;
        this.price = price;
        this.tax = tax;

        ProductController.count ++;
    }

    public String info() {
        return "제품 번호 : " + pld + "\n" +
                "제품 명 : " + pName + "\n" +
                "제품 가격 : " + price + "\n" +
                "제품 세금 : " + tax + "\n"
                ;
    }

}
