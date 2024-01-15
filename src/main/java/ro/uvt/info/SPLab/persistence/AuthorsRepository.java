package ro.uvt.info.SPLab.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.uvt.info.SPLab.model.Author;

public interface AuthorsRepository extends JpaRepository<Author, Integer> {
}
