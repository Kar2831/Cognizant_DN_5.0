package design_patterns.factory;

import design_patterns.factory.classes.ExcelDocument;
import design_patterns.factory.classes.PDFDocument;
import design_patterns.factory.classes.WordDocument;
import design_patterns.factory.factory_classes.ExcelFactory;
import design_patterns.factory.factory_classes.PDFFactory;
import design_patterns.factory.factory_classes.WordFactory;

public class FactoryMethodDesignPattern {
    public static void main(String[] args) {
        PDFFactory pdfFactory = new PDFFactory();
        PDFDocument pdfDocument1 = pdfFactory.getInstance();
        PDFDocument pdfDocument2 = pdfFactory.getInstance();
        pdfDocument1.create();
        System.out.println(pdfDocument1 == pdfDocument2);

        WordFactory wordFactory = new WordFactory();
        WordDocument wordDocument1 = wordFactory.getInstance();
        WordDocument wordDocument2 = wordFactory.getInstance();
        wordDocument1.create();
        System.out.println(wordDocument1 == wordDocument2);

        ExcelFactory excelFactory = new ExcelFactory();
        ExcelDocument excelDocument1 = new ExcelDocument();
        ExcelDocument excelDocument2 = new ExcelDocument();
        excelDocument1.create();
        System.out.println(excelDocument1 == excelDocument2);
    }
}
