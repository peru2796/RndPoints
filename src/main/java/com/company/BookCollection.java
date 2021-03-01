package com.company;

import java.util.List;

public class BookCollection {
    public List<Book1> ListBook;
    public Book1 getFirstBook;

    public List<Book1> getListBook() {
        return ListBook;
    }

    public void setListBook(List<Book1> ListBook) {
        this.ListBook = ListBook;
    }

    public Book1 getGetFirstBook() {
        return getListBook().get(0);
    }

}
