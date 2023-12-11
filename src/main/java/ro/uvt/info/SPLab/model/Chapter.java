package ro.uvt.info.SPLab.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Chapter{
    private String name;
    private List<SubChapter> subChapters = new ArrayList<>();

    public Chapter(String chapterName) {
        this.name = chapterName;
    }

    public void print() {
        // TODO: Implement
    }

    public int createSubChapter(String subChapterTitle) {
        SubChapter subChapter = new SubChapter(subChapterTitle);
        this.subChapters.add(subChapter);
        return this.subChapters.size() - 1;
    }

    public SubChapter getSubChapter(int indexSubChapterOneOne) {
        return this.subChapters.get(indexSubChapterOneOne);
    }
}
