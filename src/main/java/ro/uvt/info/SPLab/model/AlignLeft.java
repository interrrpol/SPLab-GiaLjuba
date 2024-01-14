package ro.uvt.info.SPLab.model;

public class AlignLeft implements AlignStrategy{
    @Override
    public void render (Paragraph paragraph, Context context){
        String text = paragraph.getText();
        int length = text.length();

        int pageWidth = context.getPageWidth();
        int spaceNeeded = pageWidth - length;

        System.out.print(text);
        for (int i = 0; i < spaceNeeded; i++){
            System.out.print(" ");
        }
        System.out.println();
    }
}
