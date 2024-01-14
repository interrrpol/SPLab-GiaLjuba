package ro.uvt.info.SPLab.model;

import ro.uvt.info.SPLab.services.Visitor;
public interface Element {
    void print();
    void add(Element element);
    void remove(Element element);
    Element get(int id);
    void accept(Visitor v);
}
