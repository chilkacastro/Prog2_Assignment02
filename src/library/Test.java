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

/**
 *
 * @author Chilka Castro
 */
public class Test {

    public static void main(String[] args) {
        Author a1 = new Author("Yi Wang", "German", "wangy@vaniercollege.qc.ca");
        Author a2 = new Author("Jon Snow", "Canadian", "jonsnow@vaniercollege.qc.ca");
        Author[] authors1 = {a1, a2};
        Author a4 = new Author("Night King", "Canadian", "wangy@vaniercollege.qc.ca");
        Author a5 = new Author("Euron Greyjoy", "canadian", "jonsnow@vaniercollege.qc.ca");
        Author[] authors2 = {a4, a5};
        Author a6 = new Author("Haruki Murakami", "FRENCH", "harukimurakami@yahoo.ca");
        Author a7 = new Author("Haruki Murakami", "french", "harukimurakami@yahoo.ca");
        Author[] authors3 = {a6, a1, a7, a5, a4};

        Book b1 = new Book("Java Programming", authors3, 9.99);
        Book b2 = new Book("How to kill a dragon", authors3, 12.98);
        Book b3 = new Book("Norwegian Wood", authors3, 15.99);
        Book b4 = new Book("Kafka On The Shore", authors3, 14.20);
//        System.out.println(b1);
//        System.out.println(b2);
        Book[] books = {b1, b2, b3, b4};

        MyLibrary m1 = new MyLibrary(books);
        System.out.println(m1);
//        System.out.println(m1.countAuthorNum("canadian"));
        //  System.out.println(m1);

    }

}
