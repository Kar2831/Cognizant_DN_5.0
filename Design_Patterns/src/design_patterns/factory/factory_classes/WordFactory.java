package design_patterns.factory.factory_classes;

import design_patterns.factory.FactoryBuilder;
import design_patterns.factory.classes.WordDocument;

public class WordFactory extends FactoryBuilder {
    public WordDocument getInstance(){
        return new WordDocument();
    }
}
