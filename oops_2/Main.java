package assigments.oops_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
	// Encapsulation: Private fields with public getters/setters
	private String title;
	private String author;
	private boolean isAvailable;

	// Constructor
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.isAvailable = true; // By default, the book is available
	}

	// Getters and Setters
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean available) {
		isAvailable = available;
	}

	@Override
	public String toString() {
		return "Book: " + title + " by " + author + " (" + (isAvailable ? "Available" : "Borrowed") + ")";
	}
}

class Library {
	// Encapsulation: Private list of books
	private List<Book> books;

	// Constructor
	public Library() {
		books = new ArrayList<>();
	}

	// Add a new book to the library
	public void addBook(Book book) {
		books.add(book);
		System.out.println("Book added: " + book.getTitle());
	}

	// Display all books in the library
	public void displayBooks() {
		if (books.isEmpty()) {
			System.out.println("No books available in the library.");
		} else {
			System.out.println("Books in the library:");
			for (Book book : books) {
				System.out.println(book);
			}
		}
	}

	// Borrow a book by title
	public void borrowBook(String title) {
		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
				book.setAvailable(false);
				System.out.println("You have borrowed: " + book.getTitle());
				return;
			}
		}
		System.out.println("Book not available or already borrowed: " + title);
	}

	// Return a book by title
	public void returnBook(String title) {
		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(title) && !book.isAvailable()) {
				book.setAvailable(true);
				System.out.println("You have returned: " + book.getTitle());
				return;
			}
		}
		System.out.println("Book not found or already returned: " + title);
	}

	// Search for a book by title or author
	public void searchBook(String query) {
		boolean found = false;
		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(query) || book.getAuthor().equalsIgnoreCase(query)) {
				System.out.println("Book found: " + book);
				found = true;
			}
		}
		if (!found) {
			System.out.println("No books found for: " + query);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Library library = new Library();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\n--- Library Management System ---");
			System.out.println("1. Add a Book");
			System.out.println("2. Display All Books");
			System.out.println("3. Borrow a Book");
			System.out.println("4. Return a Book");
			System.out.println("5. Search for a Book");
			System.out.println("6. Exit");
			System.out.print("Choose an option: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				System.out.print("Enter book title: ");
				String title = scanner.nextLine();
				System.out.print("Enter book author: ");
				String author = scanner.nextLine();
				library.addBook(new Book(title, author));
				break;
			case 2:
				library.displayBooks();
				break;
			case 3:
				System.out.print("Enter the title of the book to borrow: ");
				String borrowTitle = scanner.nextLine();
				library.borrowBook(borrowTitle);
				break;
			case 4:
				System.out.print("Enter the title of the book to return: ");
				String returnTitle = scanner.nextLine();
				library.returnBook(returnTitle);
				break;
			case 5:
				System.out.print("Enter the title or author to search: ");
				String searchQuery = scanner.nextLine();
				library.searchBook(searchQuery);
				break;
			case 6:
				System.out.println("Exiting the system. Goodbye!");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}
