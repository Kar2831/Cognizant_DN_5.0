package design_patterns.factory.factory_classes;

import design_patterns.factory.FactoryBuilder;
import design_patterns.factory.classes.ExcelDocument;

public class ExcelFactory extends FactoryBuilder {
    public ExcelDocument getInstance(){
        return new ExcelDocument();
    }
}
