package ro.uvt.info.SPLab.model;
import ro.uvt.info.SPLab.services.Visitor;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;

@Data
@Entity
public class ImageProxy extends BaseElement implements Picture{
    @Id
    private int id;
    private String url;
    @Transient
    private Image imagine;

    public ImageProxy(String url){
        this.url = url;
        this.imagine=null;
    }

    public ImageProxy() {

    }
    @Override
    public void print(){
        loadImage();
        imagine.print();
    }
    @Override
    public void add(Element element){}

    @Override
    public void remove(Element element){}

    @Override
    public Element get(int id){
        return null;
    }

    @Override
    public String url(){
        return null;
    }

    Image loadImage(){
        if(imagine == null){
            imagine= new Image(url);
        }
        return imagine;
    }
    @Override
    public void accept(Visitor v) {
        v.visitImageProxy(this);
    }

}
