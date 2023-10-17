package ro.uvt.info.SPLab.model;

public interface Element {

    void print();

    void add(Element);

    void remove(Element);

    private Element get(int index);
}
