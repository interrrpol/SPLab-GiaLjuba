package ro.uvt.info.SPLab.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.info.SPLab.model.Book;

@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {
}