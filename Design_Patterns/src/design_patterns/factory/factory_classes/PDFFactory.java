package design_patterns.factory.factory_classes;

import design_patterns.factory.FactoryBuilder;
import design_patterns.factory.classes.PDFDocument;

public class PDFFactory extends FactoryBuilder {
    public PDFDocument getInstance(){
        return new PDFDocument();
    }
}
