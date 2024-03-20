package com.fdmgroup.icode.library.books;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
	
	
	private List<Book> bookList = new ArrayList<>();

	
	public BookRepository(@Qualifier("allBooksList") List<Book> books) {
		super();
		this.bookList = books;

	}
	
	
	public List<Book> findAll(){
        /*
         * Return the list of all books that contains the library book catalog
         */
		return null;
	}
	
    public Book save(Book book) {
        /*
         * create an object to capture the data passed in as arguments.
         * the book id should be set and generated by using the generateUniqueId method
         * Save the book to the library book catalog
         * Return the book that was saved
         * 
         */

        return null;
    }

    public List<Book> findByTitle(String title) {
        /*
         * Search for books by title in the library catalog and return the results
         *     -use iteration (for loop) to search for books by title
         *             Or
         *     -use stream to search for books by title
         */
        return null;
    }

    public List<Book> findByAuthor(String author) {
        /*
         * Search for books by author in the library catalog and return the results
         *    -use iteration (for loop) to search for books by author
         *           Or
         *   -use stream to search for books by author
         */
        return null;
    }

    public void deleteBookById(Long id) {
        /* Delete the book with the given ID
        *  Use the removeIf method to delete the book with the given ID with a lambda expression
        *       Or
        *  Use iteration (for loop) to delete the book with the given ID and conditionals
        *  The method should return void
        */
    }

    public Book updateDescription(Long id, String description) {

        /*
         * Update the description of the book with the given ID
         * Use iteration (for loop) to update the description of the book with the given ID
         *          Or
         * Use stream to update the description of the book with the given ID
         * The method should return the book with the updated description or null if no book is found
         */
        return null;
    }


	public Book findById(Long id) {
        /*
         * Search for a book by ID in the library catalog and return the book
         *   -use iteration (for loop) to search for a book by ID
         *          Or
         *  -use stream to search for a book by ID
         * The method should return the book with the given ID or null if no book is found
         */
		return null;
	}


	public Book searchByBookId(Long bookId) {
        /*
         * Search for a book by ID in the library catalog and return the book
         *  -use iteration (for loop) to search for a book by ID
         *         Or
         * -use stream to search for a book by ID
         * The method should return the book with the given ID or null if no book is found
         * 
         */
		return null;
	}

}