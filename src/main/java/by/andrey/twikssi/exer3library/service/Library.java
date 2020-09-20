package by.andrey.twikssi.exer3library.service;

import by.andrey.twikssi.exer3library.bean.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> library;
    public static final Logger log = LoggerFactory.getLogger(Library.class);

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

    public Book findOutBookWithName(String name){
        for (Book book:library){
            if (book.getName().toLowerCase().equals(name.toLowerCase())){
                return book;
            }
        }
        return null;
    }

    public List<Book> getAllBooksWithAuthor(String author){
        List<Book> oneAuthorHasBooks = new ArrayList<>();

        for(Book book:library){
            if (book.getAuthor().toLowerCase().equals(author.toLowerCase())){
                oneAuthorHasBooks.add(book);
            }
        }

        return oneAuthorHasBooks;
    }

    @Override
    public String toString() {
        return "Library{" +
                "library=" + library +
                '}';
    }
}
