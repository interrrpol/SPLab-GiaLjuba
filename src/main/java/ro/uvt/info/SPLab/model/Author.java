package ro.uvt.info.SPLab.model;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.io.Serializable;


@Data
@Entity


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Author implements Serializable{
    @Id
    private int id;
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname=surname;
    }

    public Author() {

    }

    public void print()
    {
        System.out.println("Name: " + name + ", surname: " + surname);
    }
}
