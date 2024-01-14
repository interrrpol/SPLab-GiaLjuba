package ro.uvt.info.SPLab.services;

import ro.uvt.info.SPLab.model.Context;
import ro.uvt.info.SPLab.model.Paragraph;
import ro.uvt.info.SPLab.services.AlignStrategy;

public class AlignRight implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph, Context context){
        String text = paragraph.getText();
        int length = text.length();
        int pageWidth = context.getPageWidth();

        int spaceNeeded = pageWidth - length;

        for(int i = 0; i < spaceNeeded; i++) {
            System.out.print(" ");
        }
        System.out.println(text);
    }
}
