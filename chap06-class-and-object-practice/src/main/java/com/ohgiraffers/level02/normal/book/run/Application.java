package com.ohgiraffers.level02.normal.book.run;

import com.ohgiraffers.level02.normal.book.model.dto.BookDTO;

public class Application {
    public static void main(String[] args) {
        BookDTO bookDTO = new BookDTO();
        bookDTO.printInformation();

        BookDTO bookDTO1 = new BookDTO("자바의정석", "도우출판","남궁성");
        bookDTO1.printInformation();

        BookDTO bookDTO2 = new BookDTO("홍길동전", "활빈당","허균",500000,0.5);
        bookDTO2.printInformation();

    }
}
