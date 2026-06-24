package design_patterns.factory.classes;

import design_patterns.factory.interfaces.Document;

public class ExcelDocument implements Document {
    @Override
    public void create(){
        System.out.println("Creating Excel Document...");
    }
}
