package ro.uvt.info.SPLab.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    private String name;
    private String surname;

    public void print()
    {
        System.out.println("Name: " + name + ", surname: " + surname);
    }
}
