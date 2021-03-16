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

/**
 * A simple class of Book
 *
 * @author Chilka Castro
 */
public class Book {
    private String title;
    private Author[] authors;
    private double price;

    /**
     * Default constructor
     */
    public Book() {
        this.title = "";
        Arrays.fill(this.authors, new Author());
        this.price = 0;
    }

    /**
     * Constructor with all data members
     *
     * @param title the title of the book
     * @param authors the authors of the book
     * @param price the price of the book
     */
    public Book(String title, Author[] authors, double price) {
        this.title = title;
        this.authors = authors;
        this.price = price;
    }

    /**
     * Copy constructor
     *
     * @param book the book object to copy
     */
    public Book(Book book) {
        this.title = book.title;
        this.authors = Arrays.copyOf(book.authors, book.authors.length);
        this.price = book.price;
    }

    /**
     * Checks if two book objects are the same or not
     *
     * @param book the book to be compared with
     * @return True if both book objects are the same and False if not
     */
    public boolean equals(Book book) {
        return this.title.equals(book.title)
                && Arrays.equals(this.authors, book.authors)
                && this.price == book.price;
    }

    /**
     * Creates a string that represents a book
     *
     * @return the string that represents a book
     */
    @Override
    public String toString() {
        String str = "";

        str += String.format("%-10s: %s\n", "Title", title);
        str += String.format("%-10s: %s\n", "Author", toString(authors));
        str += String.format("%-10s: $%.2f\n", "Price", price);

        return str;
    }

    /**
     * A customized toString to format an array of authors
     *
     * @param authors the author array to format
     * @return A string that represents the array of authors
     */
    public static String toString(Author[] authors) {
        String str = "";

        for (int i = 0; i < authors.length; i++)
            if (i == authors.length - 1)
                str += String.format("%s ", authors[i].getName());
            else                                        // with comma after name
                str += String.format("%s, ", authors[i].getName());

        return str;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }
}
