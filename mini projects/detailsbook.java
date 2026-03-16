package week_08;


class Author {
 String name;
 String email; 
   
 public Author(String name, String email) {
     this.name = name;
     this.email = email;
 }


 public void Details() {
     System.out.println(" Name: " + name);
     System.out.println("Author Email: " + email);
 }
}

class Book {
 private String title;
 private Author author; 
 
 
 public Book(String title, Author author) {
     this.title = title;
     this.author = author;
 }

 public void displayBookDetails() {
     System.out.println("Book Title: " + title);
     author.Details(); 
 }
}

public class detailsbook {
 public static void main(String[] args) {
     
     Author author = new Author("xyzsdfs", "kkse@example.com");
  
     Book book = new Book("abcsdfaw", author);

     book.displayBookDetails();
 }
}
