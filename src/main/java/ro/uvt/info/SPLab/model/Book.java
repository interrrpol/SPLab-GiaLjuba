package ro.uvt.info.SPLab.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Book extends Section{

    private String title;
    private ArrayList<Author> authors = new ArrayList<>();


    public Book(String title) {
        super(title);
    }


    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addContent(Element element){
        super.add(element);
    }
}
