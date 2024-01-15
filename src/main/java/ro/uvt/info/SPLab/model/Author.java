package ro.uvt.info.SPLab.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Author implements Serializable{
    private String name;
    private String surname;

    public void print()
    {
        System.out.println("Name: " + name + ", surname: " + surname);
    }
}
