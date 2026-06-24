package design_patterns.builder;

public class Computer {
    String cpu;
    String ram;
    String storage;

    private Computer(Builder builder){
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    static class Builder{
//        Computer computer = new Computer();
        String cpu;
        String ram;
        String storage;
        public Builder setCpu(String cpu){
            this.cpu = cpu;
            return this;
        }
        public Builder setRam(String ram){
            this.ram = ram;
            return this;
        }
        public Builder setStorage(String storage){
            this.storage = storage;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}
