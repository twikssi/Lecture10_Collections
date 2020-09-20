package by.andrey.twikssi.exer3library.service;

import by.andrey.twikssi.exer3library.bean.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> library;

    public Library() {
        this.library =new ArrayList<>();
    }

    public List<Book> getLibrary() {
        return library;
    }

    public void addBook(Book book){
        library.add(book);
    }

    public void deleteBook(Book book){
        library.remove(book);
    }
}
