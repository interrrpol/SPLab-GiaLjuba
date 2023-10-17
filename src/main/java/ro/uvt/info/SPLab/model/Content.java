package ro.uvt.info.SPLab.model;

public class Content {
    private String contentType;
    private String content;

    public Content(String contentType, String content) {
        this.contentType = contentType;
        this.content = content;
    }
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getContent() {
        return content;
    }
}
