package ro.uvt.info.SPLab.model;

public class AlignCenter implements AlignStrategy{
    @Override
    public void render(Paragraph paragraph, Context context){
        String text = paragraph.getText();
        int length = text.length();
        int pageWidth = context.getPageWidth();

        int spaceNeeded = (pageWidth - length)/ 2;

        for(int i = 0; i< spaceNeeded; i++){
            System.out.print(" ");
        }

        System.out.print(text);

        for(int i = 0; i < spaceNeeded; i++){
            System.out.print(" ");
        }

        System.out.println();
    }
}
