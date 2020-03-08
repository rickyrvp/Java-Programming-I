import java.util.ArrayList;

public class Library { //holds set of books and provides various ways to search for the books within
    private ArrayList<Book> library; // create arraylist to hold books

    public Library() {
        this.library = new ArrayList<Book>();
    }

    public void addBook(Book newBook) { // add newBook to the arrayList
        this.library.add(newBook);
    }

    public void printBooks() {
        for (Book book : library) { // for each book in library, print
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title) { // searches book by title
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book findTitle : this.library) {
            if (StringUtils.included(findTitle.title(), title)) {
                found.add(findTitle);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) { // searches books by publisher
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book findPublisher : this.library) {
            if (findPublisher.publisher().contains(publisher)) {
                found.add(findPublisher);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) { // searches books by year
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book findYear : this.library) {
            if (findYear.year() == (year)) {
                found.add(findYear);
            }
        }
        return found;
    }

}