package design_patterns.builder;

import java.awt.color.CMMException;

public class BuilderMethodDesignPattern {
    public static void main(String[] args) {
        Computer.Builder builder = new Computer.Builder();
        Computer computer = builder
                .setCpu("4 Core Processor")
                .setRam("16 GB RAM")
                .setStorage("100 GB storage")
                .build();
        System.out.println(computer.getCpu());
        builder.setCpu("8 Core Processor");
        System.out.println(computer.getCpu());
//        System.out.println(computer.getRam());
//        System.out.println(computer.getStorage());
    }
}
