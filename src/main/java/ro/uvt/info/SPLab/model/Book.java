package ro.uvt.info.SPLab.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Book {

    private String title;
    private List<Author> authors = new ArrayList<>();
    private List<Chapter> chapters = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void print()
    {
        // TODO: Implement
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public int createChapter(String chapterName) {
        Chapter chapter = new Chapter(chapterName);
        this.chapters.add(chapter);
        return this.chapters.size() - 1;
    }

    public Chapter getChapter(int indexChapterOne) {
        return this.chapters.get(indexChapterOne);
    }
}
