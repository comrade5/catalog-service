package org.example.catalogservice.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import org.springframework.data.annotation.*;
import java.time.Instant;

// Spring  Data JPA cannot use Records (Records are immutable), it should work with mutable ones
public record Book(

        @Id
        Long id,

        @Pattern(
                regexp = "^([0-9]{10}|[0-9]{13})$",
                message = "The ISBN format must be valid."
        )
        @NotBlank(message = "This book ISBN must be defined.")
        String isbn,
        @NotBlank(
                message = "The book title must be defined."
        )
        String title,
        @NotBlank(message = "The book author must be defined.")
        String author,

        @NotNull(message = "The book price must be defined.")
        @Positive(
                message = "The book price must be greater than zero."
        )
        Double price,

        // Optional Field (Some entries in table don't have this field)
        String publisher,

        @CreatedDate
        Instant createdDate,

        @LastModifiedDate
        Instant lastModifiedDate,

        // Version used for optimistic locking
        @Version
        int version
) {
        public static Book of(String isbn, String title, String author, Double price) {
                return Book.of(isbn, title, author, price, null);
        }
        public static Book of(String isbn, String title, String author, Double price, String publisher) {
                return new Book(null, isbn, title, author, price, publisher, null, null, 0);
        }
}
