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
 * A simple class of Author
 *
 * @author Chilka Castro
 */
public final class Author {
    private String name;
    private String nationality;
    private String email;
    // static
    private static final String[] VALID_NATIONALITIES = {"Canadian", "American",
            "French", "British", "German"};

    /**
     * Default constructor
     */
    public Author() {
        this.name = "";
        this.nationality = "";
        this.email = "";
    }

    /**
     * Constructors with all data members
     *
     * @param name the name of the author
     * @param nationality the nationality of the author
     * @param email the email address of the author
     */
    public Author(String name, String nationality, String email) {
        this.name = name;
        this.nationality = (isNationalityValid(nationality)) ? nationality : "";
        this.email = email;
    }

    /**
     * Copy constructor
     *
     * @param author the author object to copy
     */
    public Author(Author author) {
        this.name = author.name;
        this.nationality = author.nationality;
        this.email = author.email;
    }

    /**
     * Checks if input of nationality is valid or not
     *
     * @param nationality the input nationality
     * @return True if nationality is valid and false if not
     */
    public boolean isNationalityValid(String nationality) {
        for (String validNationality : VALID_NATIONALITIES)
            if (validNationality.equalsIgnoreCase(nationality))
                return true;

        return false;
    }

    /**
     * Checks if two author objects are the same or not
     *
     * @param author the author object to be compared with
     * @return True if both author objects are the same and False if not
     */
    public boolean equals(Author author) {
        return this.name.equals(author.name)
                && this.nationality.equals(author.nationality)
                && this.email.equals(author.email);
    }

    /**
     * Creates a string that represents an author
     *
     * @return a string that represents an author
     */
    @Override
    public String toString() {
        String str = "";

        str += String.format("%-15s: %s\n", "Name", name);
        str += String.format("%-15s: %s\n", "Nationality", nationality);
        str += String.format("%-15s: %s\n", "Email", email);

        return str;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        if (isNationalityValid(nationality))
            this.nationality = nationality;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public String getEmail() {
        return email;
    }

    public static String[] getVALID_NATIONALITIES() {
        return VALID_NATIONALITIES;
    }
}
