package ro.uvt.info.SPLab.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class SubChapter {
    private String name;
    private List<Element> elements = new ArrayList<>();

    public SubChapter(String subChapterTitle) {
        this.name = subChapterTitle;
    }


    public void print() {
        System.out.print("Subchapter: ");
        System.out.println(this.name);

        this.elements.forEach(Element::print);
    }

    public int createNewParagraph(String paragraphText) {
        Paragraph paragraph = new Paragraph(paragraphText);
        this.elements.add(paragraph);
        return this.elements.size() - 1;
    }

    public int createNewImage(String imageName) {
        Image image = new Image(imageName);
        this.elements.add(image);
        return this.elements.size() - 1;
    }

    public int createNewTable(String tableTitle) {
        Table table = new Table(tableTitle);
        this.elements.add(table);
        return this.elements.size() - 1;
    }
}
