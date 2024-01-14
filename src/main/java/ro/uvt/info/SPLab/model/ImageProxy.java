package ro.uvt.info.SPLab.model;
import ro.uvt.info.SPLab.services.Visitor;

public class ImageProxy implements Element, Picture{
    String url;
    private Image imagine;

    public ImageProxy(String url){
        this.url = url;
        this.imagine=null;
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
}
