package ro.uvt.info.SPLab.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Image {
    private String imageName;

    public void print() {
        System.out.print("Image with name: ");
        System.out.println(this.imageName);
    }
}
