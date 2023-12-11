package ro.uvt.info.SPLab.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Paragraph {
    private String text;

    public void print()
    {
        System.out.print("Paragraph: ");
        System.out.println(this.text);
    }
}
