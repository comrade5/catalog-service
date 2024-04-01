package org.example.catalogservice.exceptions;

public class BookAlreadyExistsException extends RuntimeException {
    public BookAlreadyExistsException(String isbn) {
    super("A book with ISBN " + isbn + " already exists.");
}
}
