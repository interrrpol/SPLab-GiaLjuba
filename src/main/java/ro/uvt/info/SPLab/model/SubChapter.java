package ro.uvt.info.SPLab.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class SubChapter {
    private String name;
    private List<Image> images = new ArrayList<>();
    private List<Paragraph> paragraphs = new ArrayList<>();
    private List<Table> tables = new ArrayList<>();

    public SubChapter(String subChapterTitle) {
        this.name = subChapterTitle;
    }


    public void print() {
        System.out.print("Subchapter: ");
        System.out.println(this.name);

        this.paragraphs.forEach(Paragraph::print);
        this.images.forEach(Image::print);
        this.tables.forEach(Table::print);
    }

    public int createNewParagraph(String paragraphText) {
        Paragraph paragraph = new Paragraph(paragraphText);
        this.paragraphs.add(paragraph);
        return this.paragraphs.size() - 1;
    }

    public int createNewImage(String imageName) {
        Image image = new Image(imageName);
        this.images.add(image);
        return this.paragraphs.size() - 1;
    }

    public int createNewTable(String tableTitle) {
        Table table = new Table(tableTitle);
        this.tables.add(table);
        return this.tables.size() - 1;
    }
}
