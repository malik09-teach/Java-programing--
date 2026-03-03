package week_03;
import java.util.*;
class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isIssued;
    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }
    public int getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isIssued() { return isIssued; }
    public void setIssued(boolean isIssued) { this.isIssued = isIssued; }
}
class Member {
    private int memberId;
    private String name;
    private List<Book> issuedBooks = new ArrayList<>();

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public int getMemberId() { return memberId; }
    public String getName() { return name; }
    public List<Book> getIssuedBooks() { return issuedBooks; }

    public void issueBook(Book book) { issuedBooks.add(book); }
    public void returnBook(Book book) { issuedBooks.remove(book); }
}
class Library {
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    public void addBook(int bookId, String title, String author) {
        books.add(new Book(bookId, title, author));
    }

    public void addMember(int memberId, String name) {
        members.add(new Member(memberId, name));
    }
    public void issueBook(int bookId, int memberId) {
        Book book = findBook(bookId);
        Member member = findMember(memberId);
        if (book == null || member == null || book.isIssued()) return;
        book.setIssued(true);
        member.issueBook(book);
    }

    public void returnBook(int bookId, int memberId) {
        Book book = findBook(bookId);
        Member member = findMember(memberId);
        if (book == null || member == null || !book.isIssued()) return;
        book.setIssued(false);
        member.returnBook(book);
    }

    public void displayBooks() {
        System.out.println("\nLibrary Books:");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println(book.getBookId() + ": " + book.getTitle() + " by " + book.getAuthor() + 
                               (book.isIssued() ? " (Issued)" : " (Available)"));
        }
    }

    public void displayMembers() {
        System.out.println("\nLibrary Members:");
        for (int i = 0; i < members.size(); i++) {
            Member member = members.get(i);
            System.out.print(member.getMemberId() + ": " + member.getName() + " - ");
            if (member.getIssuedBooks().isEmpty()) {
                System.out.println("No books issued");
            } else {
                for (int j = 0; j < member.getIssuedBooks().size(); j++) {
                    System.out.print(member.getIssuedBooks().get(j).getTitle() + ", ");
                }
                System.out.println();
            }
        }
    }

    private Book findBook(int bookId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookId() == bookId) {
                return books.get(i);
            }
        }
        return null;
    }

    private Member findMember(int memberId) {
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getMemberId() == memberId) {
                return members.get(i);
            }
        }
        return null;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(1, "Java Basics", "John Doe");
        library.addBook(2, "Data Structures", "Jane Smith");
        library.addMember(101, "Alice");
        library.addMember(102, "Bob");

        library.issueBook(1, 101);
        library.displayBooks();
        library.displayMembers();

        library.returnBook(1, 101);
        library.displayBooks();
        library.displayMembers();
    }
}