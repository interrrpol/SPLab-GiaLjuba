package ro.uvt.info.SPLab.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import ro.uvt.info.SPLab.model.Book;

import java.io.*;
public class SaveBookCommand implements Command{
    private Book book;
    private String path;

    public SaveBookCommand (Book book, String path){
        this.book = book;
        this.path = path;
    }

    @Override
    public void execute(){
        try{
            //converting the book to JSON using ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();
            String bookJSON = objectMapper.writeValueAsString(book);

            //JSON string to file
            try(PrintWriter writer = new PrintWriter(new FileWriter(path))){
                writer.println(bookJSON);
                System.out.println("The book has been written to the file: " + path);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
