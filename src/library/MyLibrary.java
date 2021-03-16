/*
 * The MIT License
 *
 * Copyright 2021 Chilka Castro.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package library;

import java.util.Arrays;
import java.util.Random;

/**
 * A simple class of library
 *
 * @author Chilka Castro
 */
public class MyLibrary {
    private Book[] books;

    /**
     * Default constructor
     */
    public MyLibrary() {
        Arrays.fill(this.books, new Book());
    }

    /**
     * Constructor with complete data member
     *
     * @param books the books array(collection of books)
     */
    public MyLibrary(Book[] books) {
        this.books = books;
    }

    /**
     * Copy constructor
     *
     * @param myLibrary the library object to copy
     */
    public MyLibrary(MyLibrary myLibrary) {
        this.books = Arrays.copyOf(myLibrary.books, myLibrary.books.length);
    }

    /**
     * Selects a random book
     *
     * @return a randomly selected book from the array
     */
    public Book selectBook() {
        Random rand = new Random();

        return books[(rand.nextInt(books.length))];
    }

    /**
     * Selects a book using an index
     *
     * @param idx the index of the book to select
     * @return a selected book based on the input index or a randomly selected
     * book
     */
    public Book selectBook(int idx) {
        return (idx >= 0) ? books[idx] : selectBook();
    }

    /**
     * Calculates the total price of all the books in the library
     *
     * @return the total price of all the books in the library
     */
    public double calcTotalPrice() {
        double totalPrice = 0;

        for (Book book : books)
            totalPrice += book.getPrice();

        return totalPrice;
    }

    /**
     * Counts how many authors of books in the library have the same nationality
     * as the input nationality
     *
     * @param nationality the input nationality to be compared with an author's
     * nationality
     * @return the number of authors that have the same nationality with the
     * input nationality.
     */
    public int countAuthorNum(String nationality) {
        int count = 0;

        for (Book book : books)
            for (Author author : book.getAuthors())
                if (author.getNationality().equalsIgnoreCase(nationality))
                    count++;

        return count;
    }

    /**
     * Checks if both library objects are the same or not
     *
     * @param myLibrary the library object to be compared with.
     * @return True if they both libraries are the same and False if not
     */
    public boolean equals(MyLibrary myLibrary) {
        return Arrays.equals(this.books, myLibrary.books);
    }

    /**
     * A String to represent the library
     *
     * @return a String that represents the library
     */
    @Override
    public String toString() {
        return String.format("%s", toString(books));
    }

    /**
     * A customized toString method to format an array of books
     *
     * @param books the books array to format
     * @return A string that represents the array of books
     */
    public static String toString(Book[] books) {
        String str = "";

        for (Book book : books)
            str += String.format("%-10s\n", book);

        return str;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
