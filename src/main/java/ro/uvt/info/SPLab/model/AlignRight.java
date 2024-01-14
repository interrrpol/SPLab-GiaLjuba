package ro.uvt.info.SPLab.model;

public class AlignRight implements AlignStrategy{
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
