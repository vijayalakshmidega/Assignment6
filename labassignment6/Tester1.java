package labassignment6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Tester1 {
	public static void main(String[] args) {
			
			Book book = new Book(1, " java", "john");
			Book book1 = new Book(2, "c", "lincohn");
			Book book2 = new Book(3, "html", "Syed");
			Book book3 = new Book(4, "let's us c++", "Yaswanth kanethkar");
			
			
			CollectionOfBook bookCol = new CollectionOfBook();
			bookCol.bookList.add(book);
			bookCol.bookList.add(book1);
			bookCol.bookList.add(book2);
			bookCol.bookList.add(book3);
			
			System.out.println("---------------before sorting---------------");
			printBooks(bookCol.bookList);
			
			
			Book bookUpdate = new Book("c++", "george");
			bookCol.hasBook(bookUpdate);
			System.out.println("---------------after sorting by book title---------------");
			bookCol.sortByBookName();
			
			System.out.println("---------------after sorting by author ---------------");
			bookCol.sortByAuthor();
		}
		
		private static void printBooks(List<Book> bookList) {
			
			for(Book book: bookList) {
				System.out.println(book);
			}
		}


	}


