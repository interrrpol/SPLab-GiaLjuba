package ro.uvt.info.SPLab.services;

import ro.uvt.info.SPLab.model.Context;
import ro.uvt.info.SPLab.model.Paragraph;

public interface AlignStrategy {
    public void render(Paragraph paragraph, Context context);
}
