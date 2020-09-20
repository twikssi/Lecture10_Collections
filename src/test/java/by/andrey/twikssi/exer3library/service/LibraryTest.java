package by.andrey.twikssi.exer3library.service;

import by.andrey.twikssi.exer3library.bean.Book;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {
    Book gameOf;
    Book breakfast;
    Book catcher;
    Book life;
    Library library;

    @Before
    public void setup(){
         gameOf = new Book("Game of Thron","Martin");
         breakfast = new Book("Breakfast at Tiffany", "Capote");
         catcher = new Book ("The Catcher on the Rue", "Sellinger");
         life = new Book ("Life is short", "Remark");

         library = new Library();
    }

    @Test
    public void addBook() {
        library.addBook(gameOf);
        library.addBook(breakfast);
        library.addBook(catcher);
        library.addBook(life);
        library.addBook(new Book("BelarussianFreedomBook","Herski"));

        assertEquals(catcher, library.getBooksLibrary().get(2));
        assertEquals("BelarussianFreedomBook", library.getBooksLibrary().get(4).getName());
        assertEquals("Capote",library.getBooksLibrary().get(1).getAuthor());
    }

    @Test
    public void deleteBook() {
        library.addBook(gameOf);
        library.addBook(breakfast);
        library.addBook(catcher);
        library.addBook(life);
        library.addBook(new Book("BelarussianFreedomBook","Herski"));

        Book bookDelete = new Book("The Catcher on the Rue", "Sellinger");

        library.deleteBook(bookDelete);

        assertEquals(life, library.getBooksLibrary().get(2));
    }

    @Test
    public void findOutBookWithName() {
        library.addBook(gameOf);
        library.addBook(breakfast);
        library.addBook(catcher);
        library.addBook(life);
        library.addBook(new Book("BelarussianFreedomBook","Herski"));

        assertEquals("The Catcher on the Rue",library.findOutBookWithName("the catcher on the Rue").getName());
    }

    @Test(expected = NullPointerException.class)
    public void findOutBookWithNameReturnNull() {
        library.addBook(gameOf);
        library.addBook(breakfast);
        library.addBook(catcher);
        library.addBook(life);
        library.addBook(new Book("BelarussianFreedomBook","Herski"));
        library.findOutBookWithName("Dranker").getName();
    }

    @Test
    public void getAllBooksWithAuthor() {
        library.addBook(gameOf);
        library.addBook(breakfast);
        library.addBook(catcher);
        library.addBook(life);
        library.addBook(new Book("BelarussianFreedomBook","Herski"));
        library.addBook(new Book("Nine stories","sellinger"));

        assertEquals("[Book{name='The Catcher on the Rue', author='Sellinger'}, Book{name='Nine stories', author='sellinger'}]",
                library.getAllBooksWithAuthor("sellinger").toString());
    }

    @Test
    public void getAllBooksWithAuthorReturnSizeZero() {
        library.addBook(gameOf);
        library.addBook(breakfast);
        library.addBook(catcher);
        library.addBook(life);
        library.addBook(new Book("BelarussianFreedomBook","Herski"));
        library.addBook(new Book("Nine stories","sellinger"));

        assertEquals(0,library.getAllBooksWithAuthor("Peppa Pig").size());
    }
}