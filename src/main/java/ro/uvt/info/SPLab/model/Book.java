package ro.uvt.info.SPLab.model;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Book extends Section implements Serializable{

    //private String title;
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
