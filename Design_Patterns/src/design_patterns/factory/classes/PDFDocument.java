package design_patterns.factory.classes;

import design_patterns.factory.interfaces.Document;

public class PDFDocument implements Document {
    @Override
    public void create(){
        System.out.println("Creating PDF Document...");
    }
}
