package by.andrey.twikssi.exer3library.service;

import by.andrey.twikssi.exer3library.bean.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> booksLibrary;

    public Library() {
        this.booksLibrary =new ArrayList<>();
    }

    public List<Book> getBooksLibrary() {
        return booksLibrary;
    }

    public void addBook(Book book){
        booksLibrary.add(book);
    }

    public void deleteBook(Book book){
        booksLibrary.remove(book);
    }

    public Book findOutBookWithName(String name){
        for (Book book: booksLibrary){
            if (book.getName().equalsIgnoreCase(name)){
                return book;
            }
        }
        ("look").equalsIgnoreCase("LOOK");
        return null;
    }

    public List<Book> getAllBooksWithAuthor(String author){
        List<Book> oneAuthorHasBooks = new ArrayList<>();

        for(Book book: booksLibrary){
            if (book.getAuthor().equalsIgnoreCase(author)){
                oneAuthorHasBooks.add(book);
            }
        }

        return oneAuthorHasBooks;
    }

    @Override
    public String toString() {
        return "Library{" +
                "library=" + booksLibrary +
                '}';
    }
}
