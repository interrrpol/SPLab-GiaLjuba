package ro.uvt.info.SPLab.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.uvt.info.SPLab.command.CreateBookCommand;
import ro.uvt.info.SPLab.model.*;
import ro.uvt.info.SPLab.persistence.BooksRepository;
@RestController
@RequestMapping("/books")
public class BookController {
    private final BooksRepository booksRepository;

    @Autowired
    public BookController(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @PostMapping
    public Book createBook(@RequestBody CreateBookCommand command) {
        Book book = new Book();
        // Set properties on book using command

        // Save the book using the repository
        book = booksRepository.save(book);

        return book;
    }
}
