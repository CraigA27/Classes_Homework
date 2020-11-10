import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<HashMap> books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<HashMap>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return this.books.size();
    }

    public void addBookToStock(HashMap book) {
        int currentBooks = bookCount();
        if(currentBooks < this.capacity)
            this.books.add(book);
    }

}
