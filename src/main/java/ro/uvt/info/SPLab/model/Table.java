package ro.uvt.info.SPLab.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Table {
    private String title;

    public void print()
    {
        System.out.print("Table with Title: ");
        System.out.println(this.title);
    }
}
