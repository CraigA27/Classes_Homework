import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private HashMap book1;
    private HashMap book2;
    private HashMap book3;

    @Before
    public void before() {
        library = new Library(3);
        book1 = new HashMap<String, String>();
        book1.put("Title", "Use of Weapons");
        book1.put("Author", "Iain M. Banks");
        book1.put("Genre", "Science Fiction");
        book2 = new HashMap<String, String>();
        book2.put("Title", "The Last Wish");
        book2.put("Author", "Andrzej Sapkowski");
        book2.put("Genre", "Fantasy");
        book3 = new HashMap<String, String>();
        book3.put("Title", "A Game of Thrones");
        book3.put("Author", "George R.R. Martin");
        book3.put("Genre", "Fantasy");
    }

    @Test
    public void getBookCount(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBookToStock(){
        library.addBookToStock(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canNotAddBookToStock(){
        library.addBookToStock(book1);
        library.addBookToStock(book1);
        library.addBookToStock(book1);
        library.addBookToStock(book1);
        assertEquals(3, library.bookCount());
    }


}
