package ro.uvt.info.SPLab.model;

import lombok.Getter;

@Getter
public class Context {
    private int pageWidth = 150;

    public Context(){

    }

    public Context(int pageWidth){
        this.pageWidth = pageWidth;
    }

    public void setPageWidth(int pageWidth){
        this.pageWidth = pageWidth;
    }
}
