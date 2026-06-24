package design_patterns.factory.classes;

import design_patterns.factory.interfaces.Document;

public class WordDocument implements Document {
    @Override
    public void create(){
        System.out.println("Creating Word Document...");
    }
}
