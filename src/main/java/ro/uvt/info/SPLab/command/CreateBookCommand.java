package ro.uvt.info.SPLab.command;
import ro.uvt.info.SPLab.model.Book;
import ro.uvt.info.SPLab.persistence.BooksRepository;


public class CreateBookCommand {
    private BooksRepository booksRepository;

    public CreateBookCommand(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public Book execute() {
        Book book = new Book();
        // Set properties on book

        // Save the book using the repository
        return booksRepository.save(book);
    }

}
