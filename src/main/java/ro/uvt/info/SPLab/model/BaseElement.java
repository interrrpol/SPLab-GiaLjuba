package ro.uvt.info.SPLab.model;

import jakarta.persistence.*;
import lombok.Data;
import ro.uvt.info.SPLab.services.Visitor;

@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class BaseElement implements Element{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Override
    public void print(){}

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int id) {
        return null;
    }

    @Override
    public void accept(Visitor v) {

    }
}
